package io.hops.metadata.yarn.entity;

/**
 * Hop object representing the inactivenodes Map of RMContext.
 */
public class RMContextInactiveNodes {

  private final String rmnodeid;

  public RMContextInactiveNodes(String rmnodeid) {
    this.rmnodeid = rmnodeid;
  }

  public String getRmnodeid() {
    return rmnodeid;
  }

}
