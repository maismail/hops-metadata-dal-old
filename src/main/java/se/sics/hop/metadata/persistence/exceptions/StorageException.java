package se.sics.hop.metadata.persistence.exceptions;

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
