package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNextHeartbeat {

  private final String rmnodeid;
  private final boolean nextheartbeat;

  /**
   *
   * @param rmnodeid
   * @param nextheartbeat
   */
  public HopNextHeartbeat(String rmnodeid, boolean nextheartbeat) {
    this.rmnodeid = rmnodeid;
    this.nextheartbeat = nextheartbeat;
  }

  /**
   *
   * @return
   */
  public String getRmnodeid() {
    return rmnodeid;
  }

  /**
   *
   * @return
   */
  public boolean isNextheartbeat() {
    return nextheartbeat;
  }

  @Override
  public String toString() {
    return "HopNextHeartbeat{" + "rmnodeid=" + rmnodeid + ", nextheartbeat="
            + nextheartbeat + '}';
  }

}
