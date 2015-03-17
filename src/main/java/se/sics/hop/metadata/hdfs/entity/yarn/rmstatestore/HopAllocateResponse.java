
package se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore;

public class HopAllocateResponse {

  private final String applicationattemptid;
  private final byte[] allocateResponse;

  public HopAllocateResponse(String applicationattemptid, byte[] allocateResponse) {
    this.applicationattemptid = applicationattemptid;
    this.allocateResponse = allocateResponse;
  }

  public String getApplicationattemptid() {
    return applicationattemptid;
  }

  public byte[] getAllocateResponse() {
    return allocateResponse;
  }
  
}
