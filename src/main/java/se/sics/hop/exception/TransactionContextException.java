package se.sics.hop.exception;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 */
public class TransactionContextException extends HopsException {

  public TransactionContextException() {
  }

  public TransactionContextException(String message) {
    super(message);
  }

  public TransactionContextException(String message, Throwable cause) {
    super(message, cause);
  }

  public TransactionContextException(Throwable cause) {
    super(cause);
  }
}
