package se.sics.hop.transaction.lock;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface TransactionLocks extends OldTransactionLocks {

  public static class LockNotAddedException extends RuntimeException {

    public LockNotAddedException() {
    }

    public LockNotAddedException(String message) {
      super(message);
    }

    public LockNotAddedException(String message, Throwable cause) {
      super(message, cause);
    }

    public LockNotAddedException(Throwable cause) {
      super(cause);
    }

    public LockNotAddedException(String message, Throwable cause,
        boolean enableSuppression, boolean writableStackTrace) {
      super(message, cause, enableSuppression, writableStackTrace);
    }
  }

  TransactionLocks addLock(HopsLock lock);

  boolean containsLock(HopsLock.Type lock);

  HopsLock getLock(HopsLock.Type lock) throws LockNotAddedException;
}
