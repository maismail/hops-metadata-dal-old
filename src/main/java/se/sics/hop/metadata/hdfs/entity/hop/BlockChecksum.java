package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.FinderType;

public class BlockChecksum {
  private int inodeId;
  private int blockIndex;
  private long checksum;

  public static enum Finder implements FinderType<BlockChecksum> {
    ByKeyTuple,
    ByInodeId;

    @Override
    public Class getType() {
      return BlockChecksum.class;
    }

    @Override
    public Annotation getAnnotated() {
      switch (this){
        case ByKeyTuple: return Annotation.PrimaryKey;
        case ByInodeId: return Annotation.PrunedIndexScan;
        default: throw new IllegalStateException();
      }
    }

  }

  public BlockChecksum() {

  }

  public BlockChecksum(int inodeId, int blockIndex, long checksum) {
    this.inodeId = inodeId;
    this.blockIndex = blockIndex;
    this.checksum = checksum;
  }

  public int getInodeId() {
    return inodeId;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }

  public int getBlockIndex() {
    return blockIndex;
  }

  public void setBlockIndex(int blockIndex) {
    this.blockIndex = blockIndex;
  }

  public long getChecksum() {
    return checksum;
  }

  public void setChecksum(long checksum) {
    this.checksum = checksum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    BlockChecksum that = (BlockChecksum) o;

    if (blockIndex != that.blockIndex) return false;
    if (checksum != that.checksum) return false;
    if (inodeId != that.inodeId) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = inodeId;
    result = 31 * result + blockIndex;
    result = 31 * result + (int) (checksum ^ (checksum >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "BlockChecksum{" +
        "inodeId=" + inodeId +
        ", blockIndex=" + blockIndex +
        ", checksum=" + checksum +
        '}';
  }
}
