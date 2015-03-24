package io.hops.metadata.hdfs.entity;

public abstract class Replica implements Comparable<Replica> {

  protected int storageId;
  protected long blockId;
  private int inodeId;

  public Replica(int storageId, long blockId, int inodeId) {
    this.storageId = storageId;
    this.blockId = blockId;
    this.inodeId = inodeId;
  }

  /**
   * @return the storageId
   */
  public int getStorageId() {
    return storageId;
  }

  /**
   * @param storageId
   *     the storageId to set
   */
  public void setStorageId(int storageId) {
    this.storageId = storageId;
  }

  /**
   * @return the blockId
   */
  public long getBlockId() {
    return blockId;
  }

  /**
   * @param blockId
   *     the blockId to set
   */
  public void setBlockId(long blockId) {
    this.blockId = blockId;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + this.storageId;
    hash = 59 * hash + (int) (this.blockId ^ (this.blockId >>> 32));
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Replica other = (Replica) obj;
    if (this.storageId != other.storageId) {
      return false;
    }
    if (this.blockId != other.blockId) {
      return false;
    }
    return true;
  }

  public int getInodeId() {
    return inodeId;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }

  @Override
  public int compareTo(Replica t) {
    if (this.equals(t)) {
      return 0;
    }

    if (t == null) {
      return 1;
    }
    
    if (this.getStorageId() == t.getStorageId()) {
      if (this.getBlockId() > t.getBlockId()) {
        return 1;
      } else {
        return -1;
      }
    } else {
      if (this.getStorageId() > t.getStorageId()) {
        return 1;
      } else {
        return -1;
      }
    }
  }
  
}
