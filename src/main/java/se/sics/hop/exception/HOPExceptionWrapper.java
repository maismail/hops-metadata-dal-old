package se.sics.hop.exception;

/**
 *
 * @author Salman <salman@sics.se>
 */
public class HOPExceptionWrapper extends StorageException {

  Throwable ex;
  
  public HOPExceptionWrapper(Throwable ex)
  {
    super(ex);
    this.ex = ex;
  }
  
  public Throwable getOriginalException(){
    return ex;
  }

  @Override
  public String toString() {
    return ex.toString();
  }
}
