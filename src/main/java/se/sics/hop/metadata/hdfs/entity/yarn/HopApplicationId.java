package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationId {

  private final String id;
  private final int appid;
  private final long clustertimestamp;

  public HopApplicationId(String id, int appid, long clustertimestamp) {
    this.id = id;
    this.appid = appid;
    this.clustertimestamp = clustertimestamp;
  }

  public String getId() {
    return id;
  }

  public int getAppid() {
    return appid;
  }

  public long getClustertimestamp() {
    return clustertimestamp;
  }

  /**
   *
   * @param object
   * @return
   */
  @Override
  public boolean equals(Object object) {
    if (object instanceof HopApplicationId) {
      HopApplicationId oth = (HopApplicationId) object;
      return id.equals(oth.getId()) && appid == oth.getAppid() && clustertimestamp == oth.getClustertimestamp();
    } else {
      return false;
    }

  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
    hash = 53 * hash + this.appid;
    hash = 53 * hash + (int) (this.clustertimestamp ^ (this.clustertimestamp >>> 32));
    return hash;
  }
}
