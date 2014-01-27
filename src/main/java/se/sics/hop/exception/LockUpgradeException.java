package se.sics.hop.exception;

import se.sics.hop.exception.StorageException;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author Salman <salman@sics.se>
 */
public class LockUpgradeException extends StorageException {

  public LockUpgradeException(String message) {
    super(message);
  }
  
  public LockUpgradeException(Throwable ex)
  {
    super(ex);
  }
}
