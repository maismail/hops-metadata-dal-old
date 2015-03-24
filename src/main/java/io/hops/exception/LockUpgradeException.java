package io.hops.exception;

public class LockUpgradeException extends TransactionContextException {

  public LockUpgradeException() {
  }

  public LockUpgradeException(String message) {
    super(message);
  }

  public LockUpgradeException(String message, Throwable cause) {
    super(message, cause);
  }

  public LockUpgradeException(Throwable cause) {
    super(cause);
  }
}
