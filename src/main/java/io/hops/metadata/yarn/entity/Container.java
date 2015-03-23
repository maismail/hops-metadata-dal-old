package io.hops.metadata.yarn.entity;

public class Container {

  private final String containerId;
  private final byte[] containerstate;

  public Container(String containerId, byte[] containerstate) {
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
