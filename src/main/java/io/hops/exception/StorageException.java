package io.hops.exception;

public class StorageException extends HopsException {
  public StorageException() {
  }

  public StorageException(String message) {
    super(message);
  }

  public StorageException(Throwable cause) {
    super(cause);
  }

  public StorageException(String message, Throwable cause) {
    super(message, cause);
  }
}
