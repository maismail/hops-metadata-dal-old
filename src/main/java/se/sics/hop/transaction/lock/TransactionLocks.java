package se.sics.hop.transaction.lock;

import java.util.Collection;

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
  }

  TransactionLocks add(HopsLock lock);
  TransactionLocks add(Collection<HopsLock> locks);
  
  boolean containsLock(HopsLock.Type lock);

  HopsLock getLock(HopsLock.Type lock) throws LockNotAddedException;
}
