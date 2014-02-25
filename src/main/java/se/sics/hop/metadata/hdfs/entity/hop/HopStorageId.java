package se.sics.hop.metadata.hdfs.entity.hop;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopStorageId {

  private final String storageId;
  private final int sId;

  public HopStorageId(String storageId, int sId) {
    this.storageId = storageId;
    this.sId = sId;
  }

  public String getStorageId() {
    return storageId;
  }

  public int getsId() {
    return sId;
  }
}
