package se.sics.hop.exception;

import se.sics.hop.exception.PersistanceException;

/**
 *
 * @author hooman
 */
public class INodeResolveException extends PersistanceException {

  public INodeResolveException(String message) {
    super(message);
  }

  public INodeResolveException(Throwable ex) {
    super(ex);
  }
}
