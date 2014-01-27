package se.sics.hop.exception;

import se.sics.hop.exception.StorageException;

/**
 *
 * @author salman niazi <salman@sics.se>
 */
public class TransactionLockAcquireFailure extends StorageException {

  public TransactionLockAcquireFailure(String msg) {
    super(msg);
  }
  
}
