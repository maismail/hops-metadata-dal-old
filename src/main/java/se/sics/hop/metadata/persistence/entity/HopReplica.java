package se.sics.hop.metadata.persistence.entity;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public abstract class HopReplica implements Comparable<HopReplica> {

  protected String storageId;
  protected long blockId;

  public HopReplica(String storageId, long blockId) {
    this.storageId = storageId;
    this.blockId = blockId;
  }

  /**
   * @return the storageId
   */
  public String getStorageId() {
    return storageId;
  }

  /**
   * @param storageId the storageId to set
   */
  public void setStorageId(String storageId) {
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
  public boolean equals(Object obj) {
    if (obj == null || !(obj instanceof HopReplica)) {
      return false;
    }

    HopReplica other = (HopReplica) obj;
    return this.blockId == other.getBlockId()
            && this.storageId.equals(other.getStorageId());
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 23 * hash + (this.storageId != null ? this.storageId.hashCode() : 0);
    hash = 23 * hash + (int) (this.blockId ^ (this.blockId >>> 32));
    return hash;
  }

  @Override
  public int compareTo(HopReplica t) {
    if (this.equals(t)) {
      return 0;
    }

    if (t == null) {
      return 1;
    }

    int sIdResult = this.getStorageId().compareTo(t.getStorageId());
    if (sIdResult != 0) {
      return sIdResult;
    }

    if (this.getBlockId() > t.getBlockId()) {
      return 1;
    } else {
      return -1;
    }
  }
}
