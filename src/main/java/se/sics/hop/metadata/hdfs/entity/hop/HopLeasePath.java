package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public class HopLeasePath implements Comparable<HopLeasePath> {

  public static enum Finder implements FinderType<HopLeasePath> {

    ByHolderId, ByPKey, ByPrefix, All;

    @Override
    public Class getType() {
      return HopLeasePath.class;
    }
  }
  private int holderId;
  private String path;

  public HopLeasePath(String path, int holderId) {
    this.holderId = holderId;
    this.path = path;
  }

  /**
   * @return the holderId
   */
  public int getHolderId() {
    return holderId;
  }

  /**
   * @param holderId the holderId to set
   */
  public void setHolderId(int holderId) {
    this.holderId = holderId;
  }

  /**
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * @param path the path to set
   */
  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public int compareTo(HopLeasePath t) {
    return this.path.compareTo(t.getPath());
  }

  @Override
  public boolean equals(Object obj) {
    HopLeasePath other = (HopLeasePath) obj;
    return (this.path.equals(other.getPath()) && this.holderId == other.getHolderId());
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 37 * hash + (this.path != null ? this.path.hashCode() : 0);
    return hash;
  }

  @Override
  public String toString() {
    return this.path;
  }
}
