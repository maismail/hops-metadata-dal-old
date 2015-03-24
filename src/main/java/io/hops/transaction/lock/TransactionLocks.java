package io.hops.transaction.lock;

import java.util.Collection;

public interface TransactionLocks {

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

  TransactionLocks add(Lock lock);

  TransactionLocks add(Collection<Lock> locks);
  
  boolean containsLock(Lock.Type lock);

  Lock getLock(Lock.Type lock) throws LockNotAddedException;
}
