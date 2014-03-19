package se.sics.hop.exception;

/**
 *
 * @author Salman <salman@sics.se>
 */
public class HOPExceptionWrapper extends StorageException {

  Exception ex;
  
  public HOPExceptionWrapper(Exception ex)
  {
    super(ex);
    this.ex = ex;
  }
  
  public Exception getOriginalException(){
    return ex;
  }

  @Override
  public String toString() {
    return ex.toString();
  }
  
  
}
