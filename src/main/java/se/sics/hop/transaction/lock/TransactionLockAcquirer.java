package se.sics.hop.transaction.lock;


import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class TransactionLockAcquirer {

  public abstract void addLock(HopsLock lock);

  public abstract void acquire() throws IOException, ExecutionException;
  
  public abstract TransactionLocks getLocks();
}
