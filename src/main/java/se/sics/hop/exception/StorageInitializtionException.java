package se.sics.hop.exception;

import java.io.IOException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class StorageInitializtionException extends HopsException {

  public StorageInitializtionException(String message) {
    super(message);
  }

  public StorageInitializtionException(Throwable cause) {
    super(cause);
  }
}
