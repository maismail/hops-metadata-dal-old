package se.sics.hop.transaction.handler;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import se.sics.hop.StorageConnector;
import se.sics.hop.exception.PersistanceException;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public abstract class RequestHandler {

  public interface OperationType {
  }
  protected static Log log = LogFactory.getLog(RequestHandler.class);
  protected Object[] params = null;
  public static final int RETRY_COUNT = 3;
  protected OperationType opType;
  protected static StorageConnector connector;

  public static void setStorageConnector(StorageConnector c) {
    connector = c;
  }

  public RequestHandler(OperationType opType) {
    this.opType = opType;
  }

  public Object handle() throws IOException {
    return execute(null);
  }

  public Object handle(Object info) throws IOException {
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
}
