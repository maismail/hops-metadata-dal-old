package io.hops.metadata.hdfs.entity.yarn;

/**
 * Pojo class for the RMNode.containersToClean set. Hostname, commandport point
 * to the RMNode primary key.
 */
public class HopContainerId {

  private final String rmnodeid;
  private final String containerId;

  public HopContainerId(String rmnodeid, String containerId) {
    this.rmnodeid = rmnodeid;
    this.containerId = containerId;
  }

  public String getRmnodeid() {
    return rmnodeid;
  }

  public String getContainerId() {
    return containerId;
  }

  @Override
  public String toString() {
    return "HopContainerId{" + "rmnodeid=" + rmnodeid + ", containerId="
            + containerId + '}';
  }

}
