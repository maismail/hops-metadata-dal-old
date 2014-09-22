package se.sics.hop.transaction.lock;

import se.sics.hop.exception.PersistanceException;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.entity.FinderType;
import se.sics.hop.transaction.EntityManager;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class TransactionLockAcquirer {

  public abstract TransactionLocks acquire() throws PersistanceException, IOException, ExecutionException;

  protected static void setLockMode(TransactionLockTypes.LockType mode) throws StorageException {
    switch (mode) {
      case WRITE:
        EntityManager.writeLock();
        break;
      case READ:
        EntityManager.readLock();
        break;
      case READ_COMMITTED:
        EntityManager.readCommited();
        break;
    }
  }

  //TransacationLockAcquirer Code
  protected <T> Collection<T> acquireLockList(
      TransactionLockTypes.LockType lock,
      FinderType<T> finder,
      Object... param) throws PersistanceException {

    setLockMode(lock);
    if (param == null) {
      return EntityManager.findList(finder);
    } else {
      return EntityManager.findList(finder, param);
    }
  }

  protected <T> T acquireLock(
      TransactionLockTypes.LockType lock,
      FinderType<T> finder, Object... param) throws PersistanceException {

    setLockMode(lock);
    if (param == null) {
      return null;
    }
    return EntityManager.find(finder, param);
  }
}
