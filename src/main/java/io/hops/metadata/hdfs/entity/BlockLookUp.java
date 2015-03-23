package io.hops.metadata.hdfs.entity;

public class BlockLookUp implements Comparable<BlockLookUp> {

  private long block_id;
  private int inode_id;

  public BlockLookUp(long block_id, int inode_id) {
    this.block_id = block_id;
    this.inode_id = inode_id;
  }

  public long getBlockId() {
    return block_id;
  }

  public int getInodeId() {
    return inode_id;
  }

  public void setBlockId(long block_id) {
    this.block_id = block_id;
  }

  public void setInodeId(int inode_id) {
    this.inode_id = inode_id;
  }
 
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final BlockLookUp other = (BlockLookUp) obj;
    if (this.block_id == other.block_id && this.inode_id == other.inode_id) {
      return true;
    }
    return false;
  }  
  
  
   @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + this.inode_id;
    hash = 59 * hash + (int) (this.block_id ^ (this.block_id >>> 32));
    return hash;
  }

  @Override
  public int compareTo(BlockLookUp o) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
