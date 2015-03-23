package io.hops.metadata.yarn.entity;

public class JustLaunchedContainers {

  private final String rmnodeid;
  private final String containerid;

  public JustLaunchedContainers(String rmnodeid, String containerid) {
    this.rmnodeid = rmnodeid;
    this.containerid = containerid;
  }

  public String getRmnodeid() {
    return rmnodeid;
  }

  public String getContainerId() {
    return containerid;
  }

  @Override
  public String toString() {
    return "HopJustLaunchedContainers{" + "rmnodeid=" + rmnodeid
            + ", containerid=" + containerid + '}';
  }

}
