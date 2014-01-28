package se.sics.hop.metadata.entity;

import se.sics.hop.transaction.TransactionContext;
import java.util.Collection;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import se.sics.hop.exception.PersistanceException;
import se.sics.hop.exception.StorageCallPreventedException;
import se.sics.hop.exception.StorageException;
import se.sics.hop.transaction.lock.TransactionLocks;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public abstract class EntityContext<T> {

  protected static String NOT_SUPPORTED_YET = "Not supported yet.";
  protected static String UNSUPPORTED_FINDER = "Unsupported finder.";
  protected static String UNSUPPORTED_COUNTER = "Unsupported counter.";
  private static final Log LOG = LogFactory.getLog(TransactionContext.class);
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  protected boolean storageCallPrevented = false;

  public enum LockMode {

    READ_LOCK, WRITE_LOCK, READ_COMMITTED
  }
  public static ThreadLocal<LockMode> currentLockMode = new ThreadLocal<LockMode>();

  /**
   * Defines the cache state of the request. This enum is only used for logging
   * purpose.
   */
  public enum CacheHitState {

    HIT, LOSS, NA
  }

  public abstract void add(T entity) throws PersistanceException;

  public abstract void clear();

  public abstract int count(CounterType<T> counter, Object... params) throws PersistanceException;

  public abstract T find(FinderType<T> finder, Object... params) throws PersistanceException;

  public abstract Collection<T> findList(FinderType<T> finder, Object... params) throws PersistanceException;

  public abstract void prepare(TransactionLocks tlm) throws StorageException;

  public abstract void remove(T entity) throws PersistanceException;

  public abstract void removeAll() throws PersistanceException;

  public abstract void update(T entity) throws PersistanceException;

  public static void log(String opName, CacheHitState state, String... params) {
    StringBuilder message = new StringBuilder();
    if (state == CacheHitState.HIT) {
      message.append(ANSI_GREEN).append(opName).append(" ").append("hit").append(ANSI_RESET);
    } else if (state == CacheHitState.LOSS) {
      LockMode curLock = currentLockMode.get();
      message.append(ANSI_RED);
      if (curLock != null) {
        message.append(curLock.name()).append(" ");
      }
      message.append(opName).append(" ").append("loss").append(ANSI_RESET);
    } else {
      message.append(opName).append(" ");
    }
    message.append(" ");
    if (params.length > 1) {
      for (int i = 0; i < params.length; i = i + 2) {
        message.append(" ").append(params[i]);
        message.append("=").append(params[i + 1]);
      }
    }
    LOG.debug(message.toString());
  }

  public void logError(String msg) {
    StringBuilder message = new StringBuilder();
    message.append(ANSI_RED);
    message.append(msg).append(" ");
    message.append(ANSI_RESET);
    LOG.fatal(message.toString());
  }

  public void log(String opName) {
    log(opName, CacheHitState.NA, (String) null);
  }

  public void log(String opName, CacheHitState state) {
    log(opName, state, (String) null);
  }

  public void preventStorageCall() {
    storageCallPrevented = true;
  }

  public static void setLockMode(LockMode lock) {
    currentLockMode.set(lock);
  }

  public static LockMode getLockMode() {
    return currentLockMode.get();
  }

  protected void aboutToAccessStorage() throws StorageCallPreventedException {
    if (storageCallPrevented) {
      throw new StorageCallPreventedException("Trying to access storage while it is disable in transaction, inconsistent transaction context statement.");
    }
  }

  protected void aboutToAccessStorage(String msg) throws StorageCallPreventedException {
    if (storageCallPrevented) {
      throw new StorageCallPreventedException("Trying to access storage while it is disable in transaction, inconsistent transaction context statement. Msg " + msg);
    }
  }

  protected boolean isTxRunning() {
    return storageCallPrevented;
  }
}
