package io.hops.metadata.hdfs.entity;

public class ReplicaUnderConstruction {

  private long blockId;
  private int storageId;
  private int inodeId;
  private int index;
  private int state;

  public ReplicaUnderConstruction(int state, int storageId, long blockId,
      int inodeId, int index) {
    this.state = state;
    this.storageId = storageId;
    this.blockId = blockId;
    this.index = index;
    this.inodeId = inodeId;
  }

  public long getBlockId() {
    return blockId;
  }

  public void setBlockId(long blockId) {
    this.blockId = blockId;
  }

  public int getStorageId() {
    return storageId;
  }

  public int getInodeId() {
    return inodeId;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }

  public void setStorageId(int storageId) {
    this.storageId = storageId;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }
}
