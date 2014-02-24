package se.sics.hop.transaction.handler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import se.sics.hop.exception.StorageException;
import org.apache.log4j.NDC;
import se.sics.hop.exception.PersistanceException;
import se.sics.hop.metadata.hdfs.entity.EntityContextStat;
import se.sics.hop.transaction.lock.TransactionLocks;
import se.sics.hop.transaction.EntityManager;
import se.sics.hop.transaction.TransactionInfo;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author salman <salman@sics.se>
 */
public abstract class TransactionalRequestHandler extends RequestHandler {
  public TransactionalRequestHandler(OperationType opType) {
    super(opType);
  }

  @Override
  protected Object run(Object info) throws IOException {
    boolean retry = true;
    boolean rollback = false;
    boolean txSuccessful = false;
    int tryCount = 0;
    Exception exception = null;
    long txStartTime = 0;
    TransactionLocks locks = null;
    Object txRetValue = null;
    
    boolean enableTxStats = true;
    boolean enableTxStatsForSuccessfulOps = false;
    String logFilePath = "/tmp/hop_tx_stats.txt";

    try {
      while (retry && tryCount < RETRY_COUNT && !txSuccessful) {
        retry = true;
        rollback = false;
        tryCount++;
        exception = null;
        txSuccessful = false;

        long oldTime = 0;
        long setupTime = 0;
        long acquireLockTime = 0;
        long inMemoryProcessingTime = 0;
        long commitTime = 0;
        long totalTime = 0;
        try {
          // Defines a context for every operation to track them in the logs easily.
          if (info != null && info instanceof TransactionInfo) {
            NDC.push(((TransactionInfo) info).getContextName(opType));
          } else {
            NDC.push(opType.toString());
          }

          txStartTime = System.currentTimeMillis();
          oldTime = System.currentTimeMillis();
          setUp();
          setupTime = (System.currentTimeMillis() - oldTime);
          log.debug("Pretransaction phase finished. Time " + setupTime + " ms");
          oldTime = 0;
          EntityManager.begin();
          log.debug("TX Started");
          oldTime = System.currentTimeMillis();

          locks = acquireLock();
          acquireLockTime = (System.currentTimeMillis() - oldTime);
          log.debug("All Locks Acquired. Time " + acquireLockTime + " ms");
          oldTime = System.currentTimeMillis();
          EntityManager.preventStorageCall();

          try {
            txRetValue = performTask();
          } catch (IOException e) { // all HDFS exceptions are of type IOException
                                    // all Clusterj exceptions are RuntimeException
                                    // keep running the Tx is the exception is RecoveryInProgressException
            if(e.getMessage().contains("Lease recovery is in progress")) // dont abort in case of RecoveryInProgressException
            {
              exception = e;
            }else{
              throw e;
            }
          }
          inMemoryProcessingTime = (System.currentTimeMillis() - oldTime);
          log.debug("In Memory Processing Finished. Time " + inMemoryProcessingTime + " ms");
          oldTime = System.currentTimeMillis();
          if(enableTxStats && enableTxStatsForSuccessfulOps){
            collectStats(logFilePath, exception);
          }
          EntityManager.commit(locks);
          txSuccessful = true;
          commitTime = (System.currentTimeMillis() - oldTime);
          log.debug("TX committed. Time " + commitTime + " ms");
          oldTime = System.currentTimeMillis();
          totalTime = (System.currentTimeMillis() - txStartTime);
          log.debug("TX Finished. TX Stats : Acquire Locks: " + acquireLockTime + "ms, In Memory Processing: " + inMemoryProcessingTime + "ms, Commit Time: " + commitTime + "ms, Total Time: " + totalTime + "ms");

          //post TX phase
          //any error in this phase will not re-start the tx
          //TODO: XXX handle failures in post tx phase
            if (info != null && info instanceof TransactionInfo) {
              ((TransactionInfo) info).performPostTransactionAction();
            }
          return txRetValue;
        } catch (Exception ex) { // catch checked and unchecked exceptions
          rollback = true;

          if (txSuccessful) { // exception in post Tx stage 
            retry = false;
            rollback = true;
            log.warn("Exception in Post Tx Stage. Exception is " + ex);
            ex.printStackTrace();
            return txRetValue;
          } else {
            exception = ex;
            rollback = true;
            if (ex instanceof StorageException) {
              retry = true;
            } else {
              retry = false;
            }
            log.error("Tx Failed. total tx time " + (System.currentTimeMillis() - txStartTime) + " msec. Retry(" + retry + ") TotalRetryCount(" + RETRY_COUNT + ") RemainingRetries(" + (RETRY_COUNT - tryCount) + ")", ex);
          }
        } finally {
          if (rollback) {
            try {
              if(enableTxStats){
                collectStats(logFilePath, exception);
              }
              EntityManager.rollback();
            } catch (Exception ex) {
              log.error("Could not rollback transaction", ex);
            }
          }

          NDC.pop();
          if (tryCount == RETRY_COUNT && exception != null /*&& !txSuccessful*/) {
            if (exception instanceof IOException) {
              throw (IOException) exception;
            } else if (exception instanceof RuntimeException) { // runtime exceptions etc
              throw (RuntimeException) exception;
            }
          }

        }
      }
    } finally {
    }
    return null;
  }

  public abstract TransactionLocks acquireLock() throws PersistanceException, IOException;

  @Override
  public TransactionalRequestHandler setParams(Object... params) {
    this.params = params;
    return this;
  }

  public void setUp() throws PersistanceException, IOException {
    // Do nothing.
    // This can be overriden.
  }
  
  private void collectStats(String logFilePath, Exception exception) throws PersistanceException{
    
    List<EntityContextStat> stats = (List<EntityContextStat>)EntityManager.collectSnapshotStat();
    try {
          boolean nothingChanged = true;
          for(EntityContextStat stat : stats){ // if nothing was changed in the snapshot the dont print it
            if((stat.getDeletedRows()+stat.getModifiedRows()+stat.getNewRows()) > 0){
              nothingChanged = false;
              break;
            }
          }
          if(nothingChanged){
            return;
          }
          
          File file = new File(logFilePath);
          BufferedWriter output = new BufferedWriter(new FileWriter(file,true));
          String opName = NDC.peek();
          output.write("Operation Name: "+opName+"\n");
          if(exception != null){
            output.write(exception.toString()+"\n\n");
          }
          Formatter formatter = new Formatter(Locale.US);
          // Explicit argument indices may be used to re-order output.
          formatter.format("%30s %5s %5s %5s\n", "Context Name", "New", "Mod", "Del");
          output.write(formatter.toString());
          for(EntityContextStat line : stats){
            output.write(line.toString()+"\n");
          }
          output.write("===================================================================\n\n\n\n\n");
          output.close();
        } catch ( IOException e ) {
           e.printStackTrace();
        }
  }
}
