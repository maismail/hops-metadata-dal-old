package se.sics.hop.transaction.handler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import se.sics.hop.exception.StorageException;
import se.sics.hop.exception.HOPExceptionWrapper;
import se.sics.hop.exception.PersistanceException;
import se.sics.hop.log.NDCWrapper;
import se.sics.hop.metadata.hdfs.entity.EntityContextStat;
import se.sics.hop.transaction.lock.OldTransactionLocks;
import se.sics.hop.transaction.EntityManager;
import se.sics.hop.transaction.TransactionInfo;
import static se.sics.hop.transaction.handler.RequestHandler.log;
import se.sics.hop.transaction.lock.HopsLock;
import se.sics.hop.transaction.lock.TransactionLockAcquirer;
import se.sics.hop.transaction.lock.TransactionLocks;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author salman <salman@sics.se>
 */
public abstract class TransactionalRequestHandler extends RequestHandler {
  
  public TransactionalRequestHandler(OperationType opType) {
    super(opType);
  }

  public abstract void setUp() throws IOException;

  @Override
  protected Object execute(Object info) throws IOException {
    boolean retry = true;
    boolean rollback = false;
    boolean txSuccessful = false;
    int tryCount = 0;
    Throwable throwable = null;
    TransactionLocks locks = null;
    Object txRetValue = null;

    boolean enableTxStats = false;
    boolean enableTxStatsForSuccessfulOps = false;
    String logFilePath = "/tmp/hop_tx_stats.txt";

    while (retry && tryCount < RETRY_COUNT && !txSuccessful) {
      long randWaitTime = randWait(tryCount != 0);
      long txStartTime = System.currentTimeMillis();
      long oldTime = System.currentTimeMillis();
      long setupTime = -1;
      long beginTxTime = -1;
      long acquireLockTime = -1;
      long inMemoryProcessingTime = -1;
      long commitTime = -1;
      long totalTime = -1;
      
      
      retry = true;
      rollback = false;
      tryCount++;
      throwable = null;
      txSuccessful = false;
      
      EntityManager.preventStorageCall(false);
      try {  
        setNDC(info);
        log.debug("Pretransaction phase started");
        setUp();
        
        //sometimes in setup we call light weight request handler that messes up with the NDC
        removeNDC();
        setNDC(info);
        
        setupTime = (System.currentTimeMillis() - oldTime);
        oldTime = System.currentTimeMillis();
        log.debug("Pretransaction phase finished. Time " + setupTime + " ms");
        setRandomPartitioningKey();
        EntityManager.begin();
        log.debug("TX Started");     
        beginTxTime = (System.currentTimeMillis() - oldTime);
        oldTime = System.currentTimeMillis();
        
        TransactionLockAcquirer locksAcquirer = newLockAcquirer();
        acquireLock(locksAcquirer.getLocks());
       
        locksAcquirer.acquire();
        
        acquireLockTime = (System.currentTimeMillis() - oldTime);
        oldTime = System.currentTimeMillis();
        log.debug("All Locks Acquired. Time " + acquireLockTime + " ms");
        //sometimes in setup we call light weight request handler that messes up with the NDC
        removeNDC();
        setNDC(info);
        
        EntityManager.preventStorageCall(true);
        try {
          txRetValue = performTask();
        } catch (IOException e) { // all HDFS exceptions are of type IOException
          // all Clusterj exceptions are RuntimeException
          // keep running the Tx is the exception is RecoveryInProgressException
          if (e.getMessage().contains("Lease recovery is in progress")) // dont abort in case of RecoveryInProgressException
          {
            throwable = e;
          } else {
            throw e;
          }
        }
        inMemoryProcessingTime = (System.currentTimeMillis() - oldTime);
        oldTime = System.currentTimeMillis();
        log.debug("In Memory Processing Finished. Time " + inMemoryProcessingTime + " ms");
        if (enableTxStats && enableTxStatsForSuccessfulOps) {
          collectStats(logFilePath, throwable);
        }
        EntityManager.commit(locksAcquirer.getLocks());
        commitTime = (System.currentTimeMillis() - oldTime);
        oldTime = System.currentTimeMillis();
        log.debug("TX committed. Time " + commitTime + " ms");
        txSuccessful = true;
        totalTime = (System.currentTimeMillis() - txStartTime);
        log.debug("TX Finished. TX Stats: Try Count: "+tryCount+" Rand Wait:"+randWaitTime+" Stepup: "+setupTime+"ms Begin Tx:"+beginTxTime+" Acquire Locks: " + acquireLockTime + "ms, In Memory Processing: " + inMemoryProcessingTime + "ms, Commit Time: " + commitTime + "ms, Total Time: " + totalTime + "ms");
        //post TX phase
        //any error in this phase will not re-start the tx
        //TODO: XXX handle failures in post tx phase
        if (info != null && info instanceof TransactionInfo) {
          ((TransactionInfo) info).performPostTransactionAction();
        }
        return txRetValue;
      } catch (Throwable ex) { // catch checked and unchecked exceptions
        rollback = true;

        if (txSuccessful) { // exception in post Tx stage 
          retry = false;
          rollback = true;
          log.warn("Exception in Post Tx Stage. Exception is " + ex);
          //ex.printStackTrace();
          return txRetValue;
        } else {
          throwable = ex;
          rollback = true;
          if (ex instanceof PersistanceException) {
            retry = true;
          } else {
            retry = false;
          }
          log.warn("Tx Failed. total tx time " + (System.currentTimeMillis() - txStartTime) + 
                  " msec. Retry(" + retry + ") TotalRetryCount(" + RETRY_COUNT + 
                  ") RemainingRetries(" + (RETRY_COUNT - tryCount) + 
                  ") TX Stats: Setup: "+setupTime+"ms Acquire Locks: " + acquireLockTime + 
                  "ms, In Memory Processing: " + inMemoryProcessingTime + 
                  "ms, Commit Time: " + commitTime + 
                  "ms, Total Time: " + totalTime + "ms", ex);
        }
      } finally {
        if (rollback) {
          try {
            if (enableTxStats) {
              collectStats(logFilePath, throwable);
            }
            log.error("Rollback the TX");
            EntityManager.rollback(locks);
          } catch (Exception ex) {
            log.warn("Could not rollback transaction. Error that triggered Rollback was "+throwable+" new error is "+ex, ex);
          }
        }

        //log.debug("TX Exception "+exception+" retry "+retry+" rollback "+rollback+" count "+tryCount);
        removeNDC();
        if ((tryCount == RETRY_COUNT && throwable != null && throwable
            instanceof StorageException/*&& retry == true && !txSuccessful*/)
             // ran out of retries and there is an exception
             || ( throwable != null && !(throwable instanceof StorageException))  //non storage exceptions are not retried. // you may or may not have exhausted the retry count but the tx failed because of some exception like file not found etc. in this case just throw the exception and dont retry
                ) {
          log.debug("Transaction failed after "+RETRY_COUNT+" retries. Throwing exception " + throwable);
          if (throwable instanceof IOException) {
            throw (IOException) throwable;
          } else if (throwable instanceof RuntimeException) { // runtime exceptions etc
            throw (RuntimeException) throwable;
          } else { // wrap the exception and handle it in the code
            throw new HOPExceptionWrapper(throwable);
          }
        }
      }
    }

    return null;
  }
  
  private long randWait(boolean wait){
    try {
      if (wait) {
        Random rand = new Random(System.currentTimeMillis());
        int waitTime = rand.nextInt(5000);
        log.debug("TX is being retried. Waiting for "+waitTime+" ms before retry. TX name "+opType);
        Thread.sleep(waitTime);
        return waitTime;
      }
    } catch (InterruptedException ex) {
      log.warn(ex);
    }
    return 0;
  }

  public abstract void acquireLock(TransactionLocks locks) throws IOException, ExecutionException;
  
  protected abstract TransactionLockAcquirer newLockAcquirer();

  @Override
  public TransactionalRequestHandler setParams(Object... params) {
    this.params = params;
    return this;
  }

  private void collectStats(String logFilePath, Throwable exception) throws IOException {

    List<EntityContextStat> stats = (List<EntityContextStat>) EntityManager.collectSnapshotStat();
    try {
      boolean nothingChanged = true;
      for (EntityContextStat stat : stats) { // if nothing was changed in the snapshot the dont print it
        if ((stat.getDeletedRows() + stat.getModifiedRows() + stat.getNewRows()) > 0) {
          nothingChanged = false;
          break;
        }
      }
      if (nothingChanged) {
        return;
      }

      File file = new File(logFilePath);
      BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
      String opName = NDCWrapper.peek();
      output.write("Operation Name: " + opName + "\n");
      if (exception != null) {
        output.write(exception.toString() + "\n\n");
      }
      Formatter formatter = new Formatter(Locale.US);
      // Explicit argument indices may be used to re-order output.
      formatter.format("%30s %5s %5s %5s\n", "Context Name", "New", "Mod", "Del");
      output.write(formatter.toString());
      for (EntityContextStat line : stats) {
        output.write(line.toString() + "\n");
      }
      output.write("===================================================================\n\n\n\n\n");
      output.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private void setNDC(Object info){
    // Defines a context for every operation to track them in the logs easily.
    if (info != null && info instanceof TransactionInfo) {
          NDCWrapper.push(((TransactionInfo) info).getContextName(opType));
        } else {
          NDCWrapper.push(opType.toString());
        }
  }
  
  private void removeNDC(){
    NDCWrapper.clear();
    NDCWrapper.remove();
  }
  private void setRandomPartitioningKey() throws StorageException, PersistanceException {
        //      Random rand =new Random(System.currentTimeMillis());
        //      Integer partKey = new Integer(rand.nextInt());
        //      //set partitioning key
        //      Object[] pk = new Object[2];
        //      pk[0] = partKey;
        //      pk[1] = Integer.toString(partKey);
        //
        //      EntityManager.setPartitionKey(INodeDataAccess.class, pk);
        //      
        ////      EntityManager.readCommited();
        ////      EntityManager.find(INode.Finder.ByPK_NameAndParentId, "", partKey);
    
  }
}
