package se.sics.hop.exception;

/**
 *
 * @author salman <salman@sics.se>
 */
public class HopEnitityInitializationError extends StorageException {

  public HopEnitityInitializationError(String message) {
    super(message);
  }
  
  public HopEnitityInitializationError(Throwable ex)
  {
    super(ex);
  }
}
