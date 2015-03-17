package se.sics.hop.transaction.handler;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import se.sics.hop.StorageConnector;

public abstract class RequestHandler {
  private long waitTime;

  public interface OperationType {
  }
  protected static Log log = LogFactory.getLog(RequestHandler.class);
  protected Object[] params = null;
  // TODO These should be in a config file
  public static final int RETRY_COUNT = 5;
  public static final long BASE_WAIT_TIME = 500;
  protected OperationType opType;
  protected static StorageConnector connector;

  public static void setStorageConnector(StorageConnector c) {
    connector = c;
  }

  public RequestHandler(OperationType opType) {
    this.opType = opType;
  }

  public Object handle() throws IOException {
    return handle(null);
  }

  public Object handle(Object info) throws IOException {
    waitTime = 0;
    return execute(info);
  }

  protected abstract Object execute(Object info) throws IOException;

  public abstract Object performTask() throws IOException;

  public RequestHandler setParams(Object... params) {
    this.params = params;
    return this;
  }

  public Object[] getParams() {
    return this.params;
  }

  protected long exponentialBackoff(){
    try {
      if(waitTime>0){
      log.debug("TX is being retried. Waiting for " + waitTime +
          " ms before retry. TX name " + opType);
      Thread.sleep(waitTime);
      }
      waitTime = waitTime == 0 ? BASE_WAIT_TIME : waitTime * 2;
      return waitTime;
    } catch (InterruptedException ex) {
      log.warn(ex);
    }
    return 0;
  }
}
