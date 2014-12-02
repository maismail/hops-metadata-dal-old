package se.sics.hop.transaction.lock;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class TransactionLockAcquirer {

  public abstract void addLock(HopsLock lock);

  public abstract void acquire() throws Exception;
  
  public abstract TransactionLocks getLocks();
}
