package se.sics.hop.exception;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public class StorageException extends PersistanceException {

  public StorageException(String message) {
    super(message);
  }
  
  public StorageException(Throwable ex)
  {
    super(ex);
  }
}
