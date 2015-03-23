package io.hops.metadata.hdfs.entity.hop;

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
