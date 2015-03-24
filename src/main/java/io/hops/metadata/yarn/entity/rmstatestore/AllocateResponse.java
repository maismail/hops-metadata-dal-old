package io.hops.metadata.yarn.entity.rmstatestore;

public class AllocateResponse {

  private final String applicationattemptid;
  private final byte[] allocateResponse;

  public AllocateResponse(String applicationattemptid,
      byte[] allocateResponse) {
    this.applicationattemptid = applicationattemptid;
    this.allocateResponse = allocateResponse;
  }

  public AllocateResponse(String applicationattemptid) {
    this(applicationattemptid, null);
  }
  
  public String getApplicationattemptid() {
    return applicationattemptid;
  }

  public byte[] getAllocateResponse() {
    return allocateResponse;
  }
  
}
