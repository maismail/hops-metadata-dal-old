package se.sics.hop.exception;

import se.sics.hop.exception.StorageException;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author Salman <salman@sics.se>
 */
public class AcquireLockInterruptedException extends StorageException {

  InterruptedException ex;
  
  public AcquireLockInterruptedException(InterruptedException ex)
  {
    super(ex);
    this.ex = ex;
  }
  
  public InterruptedException getOriginalException(){
    return ex;
  }
}
