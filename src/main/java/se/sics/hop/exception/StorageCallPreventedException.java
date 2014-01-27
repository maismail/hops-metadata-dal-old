package se.sics.hop.exception;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 */
public class StorageCallPreventedException extends TransactionContextException {
    public StorageCallPreventedException(String msg) {
    super(msg);
  }
}
