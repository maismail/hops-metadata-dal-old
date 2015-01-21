package se.sics.hop.transaction.handler;

import se.sics.hop.exception.StorageException;
import se.sics.hop.exception.TransientStorageException;
import se.sics.hop.log.NDCWrapper;
import se.sics.hop.transaction.context.EntityContextStat;
import se.sics.hop.transaction.EntityManager;
import se.sics.hop.transaction.TransactionInfo;
import se.sics.hop.transaction.context.TransactionsStats;
import se.sics.hop.transaction.lock.TransactionLockAcquirer;
import se.sics.hop.transaction.lock.TransactionLocks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author salman <salman@sics.se>
 */
public abstract class TransactionalRequestHandler extends RequestHandler {

  public TransactionalRequestHandler(OperationType opType) {
    super(opType);
  }

  protected abstract void preTransactionSetup() throws IOException;

  @Override
  protected Object execute(Object info) throws IOException {
    boolean rollback;
    boolean committed;
    int tryCount = 0;
    IOException ignoredException;
    TransactionLocks locks = null;
    Object txRetValue = null;

    while (tryCount <= RETRY_COUNT) {
      long expWaitTime = exponentialBackoff();
      long txStartTime = System.currentTimeMillis();
      long oldTime = System.currentTimeMillis();
      long setupTime = -1;
      long beginTxTime = -1;
      long acquireLockTime = -1;
      long inMemoryProcessingTime = -1;
      long commitTime = -1;
      long totalTime = -1;
      
      rollback = false;
      tryCount++;
      ignoredException = null;
      committed = false;
      
      EntityManager.preventStorageCall(false);
      try {
        setNDC(info);
        log.debug("Pretransaction phase started");
        preTransactionSetup();
        
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
        } catch (IOException e) {
          if (shouldAbort(e)) {
            throw e;
          } else {
            ignoredException = e;
          }
        }
        inMemoryProcessingTime = (System.currentTimeMillis() - oldTime);
        oldTime = System.currentTimeMillis();
        log.debug("In Memory Processing Finished. Time " + inMemoryProcessingTime + " ms");

        TransactionsStats.getInstance().collectStats(opType, ignoredException);

        EntityManager.commit(locksAcquirer.getLocks());
        committed = true;
        commitTime = (System.currentTimeMillis() - oldTime);
        log.debug("TX committed. Time " + commitTime + " ms");
        totalTime = (System.currentTimeMillis() - txStartTime);
        log.debug("TX Finished. TX Stats: Try Count: " + tryCount + " Wait:" +
            expWaitTime + " Stepup: " + setupTime + "ms Begin Tx:" +
            beginTxTime + " Acquire Locks: " + acquireLockTime +
            "ms, In Memory Processing: " + inMemoryProcessingTime +
            "ms, Commit Time: " + commitTime + "ms, Total Time: " + totalTime +
            "ms");
        //post TX phase
        //any error in this phase will not re-start the tx
        //TODO: XXX handle failures in post tx phase
        if (info != null && info instanceof TransactionInfo) {
          ((TransactionInfo) info).performPostTransactionAction();
        }
        return txRetValue;
      } catch (TransientStorageException e) {
        rollback = true;
        if (tryCount <= RETRY_COUNT) {
          log.error("Tx Failed. total tx time " +
              (System.currentTimeMillis() - txStartTime) +
              " msec. TotalRetryCount(" + RETRY_COUNT +
              ") RemainingRetries(" + (RETRY_COUNT - tryCount) +
              ") TX Stats: Setup: " + setupTime + "ms Acquire Locks: " +
              acquireLockTime +
              "ms, In Memory Processing: " + inMemoryProcessingTime +
              "ms, Commit Time: " + commitTime +
              "ms, Total Time: " + totalTime + "ms", e);
        } else {
          log.debug("Transaction failed after " + RETRY_COUNT + " retries.", e);
          throw e;
        }
      } catch (IOException e) {
        rollback = true;
        if (committed) {
          log.error("Exception in Post Tx Stage.", e);
        } else {
          log.error("Transaction failed", e);
        }
        throw e;
      } catch (RuntimeException e) {
        rollback = true;
        log.error("Transaction handler received a runtime exception", e);
        throw e;
      } catch (Error e) {
        rollback = true;
        log.error("Transaction handler received an error", e);
        throw e;
      } finally {
        removeNDC();
        if (rollback) {
          try {
            log.error("Rollback the TX");
            EntityManager.rollback(locks);
          } catch (Exception e) {
            log.warn("Could not rollback transaction", e);
          }
        }
        // If the code is about to return but the exception was caught
        if (ignoredException != null) {
          throw ignoredException;
        }
      }
    }
    throw new RuntimeException("TransactionalRequestHandler did not execute");
  }
  
  public abstract void acquireLock(TransactionLocks locks) throws IOException;
  
  protected abstract TransactionLockAcquirer newLockAcquirer();

  @Override
  public TransactionalRequestHandler setParams(Object... params) {
    this.params = params;
    return this;
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
  private void setRandomPartitioningKey() throws StorageException,
      StorageException {
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

  protected abstract boolean shouldAbort(Exception e);
}
