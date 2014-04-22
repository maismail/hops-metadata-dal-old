package se.sics.hop.metadata.hdfs.entity.hop;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public abstract class HopReplica implements Comparable<HopReplica> {

  protected int storageId;
  protected long blockId;
  

  public HopReplica(int storageId, long blockId) {
    this.storageId = storageId;
    this.blockId = blockId;
  }

  /**
   * @return the storageId
   */
  public int getStorageId() {
    return storageId;
  }

  /**
   * @param storageId the storageId to set
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
   * @param blockId the blockId to set
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
    final HopReplica other = (HopReplica) obj;
    if (this.storageId != other.storageId) {
      return false;
    }
    if (this.blockId != other.blockId) {
      return false;
    }
    return true;
  }


  @Override
  public int compareTo(HopReplica t) {
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
