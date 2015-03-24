package io.hops.exception;

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
