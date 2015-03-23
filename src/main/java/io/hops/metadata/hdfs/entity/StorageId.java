package io.hops.metadata.hdfs.entity;

public class StorageId {

  private final String storageId;
  private final int sId;

  public StorageId(String storageId, int sId) {
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
