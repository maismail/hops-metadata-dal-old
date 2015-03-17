package se.sics.hop.transaction.lock;

import java.io.IOException;

public abstract class TransactionLockAcquirer {

  public abstract void acquire() throws IOException;
  
  public abstract TransactionLocks getLocks();
}
