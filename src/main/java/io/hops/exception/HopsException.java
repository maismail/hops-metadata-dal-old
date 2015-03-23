package io.hops.exception;

import java.io.IOException;

public class HopsException extends IOException {
  public HopsException() {
  }

  public HopsException(String message) {
    super(message);
  }

  public HopsException(String message, Throwable cause) {
    super(message, cause);
  }

  public HopsException(Throwable cause) {
    super(cause);
  }
}
