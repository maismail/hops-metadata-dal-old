package io.hops.metadata.yarn.entity;

/**
 * Pojo class for the RMNode.containersToClean set. Hostname, commandport point
 * to the RMNode primary key.
 */
public class ContainerId {

  private final String rmnodeid;
  private final String containerId;

  public ContainerId(String rmnodeid, String containerId) {
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
    return "HopContainerId{" + "rmnodeid=" + rmnodeid + ", containerId=" +
        containerId + '}';
  }

}
