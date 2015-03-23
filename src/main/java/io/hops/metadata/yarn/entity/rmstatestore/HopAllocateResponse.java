
package io.hops.metadata.yarn.entity.rmstatestore;

public class HopAllocateResponse {

  private final String applicationattemptid;
  private final byte[] allocateResponse;

  public HopAllocateResponse(String applicationattemptid, byte[] allocateResponse) {
    this.applicationattemptid = applicationattemptid;
    this.allocateResponse = allocateResponse;
  }

  public HopAllocateResponse(String applicationattemptid) {
    this(applicationattemptid, null);
  }
  
  public String getApplicationattemptid() {
    return applicationattemptid;
  }

  public byte[] getAllocateResponse() {
    return allocateResponse;
  }
  
}
