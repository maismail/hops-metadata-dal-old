package se.sics.hop.exception;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 */
public class StorageCallPreventedException extends TransactionContextException {
  public StorageCallPreventedException() {
  }

  public StorageCallPreventedException(String message) {
    super(message);
  }

  public StorageCallPreventedException(String message, Throwable cause) {
    super(message, cause);
  }

  public StorageCallPreventedException(Throwable cause) {
    super(cause);
  }
}
