package io.hops.metadata.yarn.entity;

public class NextHeartbeat {

  private final String rmnodeid;
  private final boolean nextheartbeat;

  /**
   * @param rmnodeid
   * @param nextheartbeat
   */
  public NextHeartbeat(String rmnodeid, boolean nextheartbeat) {
    this.rmnodeid = rmnodeid;
    this.nextheartbeat = nextheartbeat;
  }

  /**
   * @return
   */
  public String getRmnodeid() {
    return rmnodeid;
  }

  /**
   * @return
   */
  public boolean isNextheartbeat() {
    return nextheartbeat;
  }

  @Override
  public String toString() {
    return "HopNextHeartbeat{" + "rmnodeid=" + rmnodeid + ", nextheartbeat=" +
        nextheartbeat + '}';
  }

}
