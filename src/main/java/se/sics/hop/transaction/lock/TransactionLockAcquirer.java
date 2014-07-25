package se.sics.hop.transaction.lock;

import java.io.IOException;
import se.sics.hop.exception.PersistanceException;
import se.sics.hop.exception.StorageException;
import static se.sics.hop.transaction.lock.TransactionLockTypes.LockType.READ;
import static se.sics.hop.transaction.lock.TransactionLockTypes.LockType.READ_COMMITTED;
import static se.sics.hop.transaction.lock.TransactionLockTypes.LockType.WRITE;
import se.sics.hop.transaction.EntityManager;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class TransactionLockAcquirer {

  public abstract TransactionLocks acquire() throws PersistanceException, IOException;
  
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
}
