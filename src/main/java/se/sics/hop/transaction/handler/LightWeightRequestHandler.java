package se.sics.hop.transaction.handler;

import java.io.IOException;
import se.sics.hop.exception.StorageException;
import se.sics.hop.exception.TransientStorageException;
import se.sics.hop.log.NDCWrapper;

public abstract class LightWeightRequestHandler extends RequestHandler {

  public LightWeightRequestHandler(OperationType opType) {
    super(opType);
  }

  @Override
  protected Object execute(Object info) throws IOException {
    int tryCount = 0;
    long totalTime = 0;

    while (tryCount <= RETRY_COUNT) {
      exponentialBackoff();
      tryCount++;
      try {
        NDCWrapper.push(opType.toString()); // Defines a context for every operation to track them in the logs easily.

        //In a tx if the lock level is set to write, does
        //it mean that all the operations after seting the lock will use write lcok?
        //Light weight tx handler is sometimes called inside a bigger tx.
        //If in the outer tx lock level was set to some thing other than read-commited
        //then we will end up taking un necessary locks.
        //To make sure that we done have this problem I explicitly set the locks to read-commited.
        connector.readCommitted();
        totalTime = System.currentTimeMillis();
        Object ret = performTask();
        totalTime = System.currentTimeMillis() - totalTime;
        log.debug("Total time taken. Time " + totalTime + " ms");
        return ret;
      } catch (TransientStorageException e) {
        if (tryCount <= RETRY_COUNT) {
          log.error("Tx Failed. total tx time " +
              " TotalRetryCount(" + RETRY_COUNT +
              ") RemainingRetries(" + (RETRY_COUNT - tryCount) +
              ") TX Stats: ms, Total Time: " + totalTime + "ms", e);
        } else {
          log.debug("Transaction failed after " + RETRY_COUNT + " retries.", e);
          throw e;
        }
      } catch (IOException e) {
        log.debug("Transaction failed.", e);
        throw e;
      } catch (RuntimeException e) {
        log.debug("Transaction failed.", e);
        throw e;
      } catch (Error e) {
        log.debug("Transaction failed.", e);
        throw e;
      } finally {
        NDCWrapper.pop();
        NDCWrapper.remove();
      }
    }

    throw new RuntimeException("LightWeightRequestHandler did not execute");
  }
}
