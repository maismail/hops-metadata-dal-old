package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.FinderType;

public class QuotaUpdate {
  private int id;
  private int inodeId;
  private long namespaceDelta;
  private long diskspaceDelta;

  public static enum Finder implements FinderType<QuotaUpdate> {
    ByINodeId;

    @Override
    public Class getType() {
      return QuotaUpdate.class;
    }

    @Override
    public Annotation getAnnotated() {
      return Annotation.PrunedIndexScan;
    }
  }

  public QuotaUpdate(int id, int inodeId, long namespaceDelta, long diskspaceDelta) {
    this.id = id;
    this.inodeId = inodeId;
    this.namespaceDelta = namespaceDelta;
    this.diskspaceDelta = diskspaceDelta;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getInodeId() {
    return inodeId;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }

  public long getNamespaceDelta() {
    return namespaceDelta;
  }

  public void setNamespaceDelta(int namespaceDelta) {
    this.namespaceDelta = namespaceDelta;
  }

  public long getDiskspaceDelta() {
    return diskspaceDelta;
  }

  public void setDiskspaceDelta(long diskspaceDelta) {
    this.diskspaceDelta = diskspaceDelta;
  }

  @Override
  public String toString() {
    return "QuotaUpdate{" +
        "id=" + id +
        ", inodeId=" + inodeId +
        ", namespaceDelta=" + namespaceDelta +
        ", diskspaceDelta=" + diskspaceDelta +
        '}';
  }
}
