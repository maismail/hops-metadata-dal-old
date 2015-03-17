package se.sics.hop.exception;

public class TransientStorageException extends StorageException {
  public TransientStorageException() {
  }

  public TransientStorageException(String message) {
    super(message);
  }

  public TransientStorageException(Throwable cause) {
    super(cause);
  }

  public TransientStorageException(String message, Throwable cause) {
    super(message, cause);
  }
}
