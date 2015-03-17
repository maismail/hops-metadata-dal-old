package se.sics.hop.exception;

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
