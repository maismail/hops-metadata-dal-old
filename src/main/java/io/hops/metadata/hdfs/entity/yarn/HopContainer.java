package io.hops.metadata.hdfs.entity.yarn;

public class HopContainer {

  private final String containerId;
  private final byte[] containerstate;

  public HopContainer(String containerId, byte[] containerstate) {
    this.containerId = containerId;
    this.containerstate = containerstate;
  }

  public String getContainerId() {
    return containerId;
  }

  public byte[] getContainerState() {
    return containerstate;
  }
}
