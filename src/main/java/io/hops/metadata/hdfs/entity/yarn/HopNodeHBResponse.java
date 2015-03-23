package io.hops.metadata.hdfs.entity.yarn;

public class HopNodeHBResponse {

  private final String rmnodeId;

  private final byte[] response;

  public HopNodeHBResponse(String rmnodeId, byte[] responseid) {
    this.rmnodeId = rmnodeId;
    this.response = responseid;
  }

  public String getRMNodeId() {
    return rmnodeId;
  }

  @Override
  public String toString() {
    return "HopNodeHBResponse{" + "rmnodeId=" + rmnodeId + '}';
  }

  public byte[] getResponse() {
    return response;
  }

}
