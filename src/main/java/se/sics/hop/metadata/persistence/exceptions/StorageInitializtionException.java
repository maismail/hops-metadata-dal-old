package se.sics.hop.metadata.persistence.exceptions;

import java.io.IOException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class StorageInitializtionException extends IOException {

  public StorageInitializtionException(String message) {
    super(message);
  }

  public StorageInitializtionException(Throwable cause) {
    super(cause);
  }
}
