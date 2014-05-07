package se.sics.hop.transaction.lock;

import java.io.IOException;
import java.util.Collection;

import se.sics.hop.exception.PersistanceException;
import static se.sics.hop.transaction.lock.TransactionLockTypes.LockType.READ;
import static se.sics.hop.transaction.lock.TransactionLockTypes.LockType.READ_COMMITTED;
import static se.sics.hop.transaction.lock.TransactionLockTypes.LockType.WRITE;

import se.sics.hop.metadata.hdfs.entity.FinderType;
import se.sics.hop.transaction.EntityManager;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class TransactionLockAcquirer {

  public abstract TransactionLocks acquire() throws PersistanceException, IOException;
  
  protected static void setLockMode(TransactionLockTypes.LockType mode) {
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
  protected static <T> Collection<T> acquireLockList(
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

  protected static <T> T acquireLock(
      TransactionLockTypes.LockType lock,
      FinderType<T> finder, Object... param) throws PersistanceException {

    setLockMode(lock);
    if (param == null) {
      return null;
    }
    return EntityManager.find(finder, param);
  }
}
