package se.sics.hop.transaction.handler;

import java.io.IOException;
import org.apache.log4j.NDC;
import se.sics.hop.exception.PersistanceException;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public abstract class LightWeightRequestHandler extends RequestHandler {

  public LightWeightRequestHandler(OperationType opType) {
    super(opType);
  }

  @Override
  protected Object run(Object info) throws IOException {
    boolean retry = true;
    int tryCount = 0;
    IOException exception = null;
    long totalTime = 0;

    try {
      while (retry && tryCount < RETRY_COUNT) {
        retry = true;
        tryCount++;
        exception = null;
        try {
          NDC.push(opType.toString()); // Defines a context for every operation to track them in the logs easily.

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
        } catch (PersistanceException ex) {
          log.error("Could not perfortm task", ex);
          retry = true;
        } catch (IOException ex) {
          exception = ex;
        } finally {
          NDC.pop();
          if(!connector.isTransactionActive()){
            NDC.remove();
          }
          
          if (tryCount == RETRY_COUNT && exception != null) {
            throw exception;
          }
        }
      }
    } finally {
    }
    return null;
  }
}
