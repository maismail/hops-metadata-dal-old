package io.hops.metadata.hdfs.entity;

import io.hops.metadata.common.FinderType;

import java.util.Collections;
import java.util.Comparator;

public class UnderReplicatedBlock {
  public static enum Finder implements FinderType<UnderReplicatedBlock> {

    ByBlockIdAndINodeId,
    ByINodeId,
    ByINodeIds;

    @Override
    public Class getType() {
      return UnderReplicatedBlock.class;
    }

    @Override
    public Annotation getAnnotated() {
      switch (this) {
        case ByBlockIdAndINodeId:
          return Annotation.PrimaryKey;
        case ByINodeId:
          return Annotation.PrunedIndexScan;
        case ByINodeIds:
          return Annotation.BatchedPrunedIndexScan;
        default:
          throw new IllegalStateException();
      }
    }

  }
  
  public static enum Order implements Comparator<UnderReplicatedBlock> {

    ByLevel() {
      @Override
      public int compare(UnderReplicatedBlock o1, UnderReplicatedBlock o2) {
        if (o1.getLevel() < o2.level) {
          return -1;
        } else {
          return 1;
        }
      }
    };
    
    @Override
    public abstract int compare(UnderReplicatedBlock o1,
        UnderReplicatedBlock o2);

    public Comparator acsending() {
      return this;
    }

    public Comparator descending() {
      return Collections.reverseOrder(this);
    }
  }

  int level;
  long blockId;
  int inodeId;

  public UnderReplicatedBlock(int level, long blockId, int inodeId) {
    this.level = level;
    this.blockId = blockId;
    this.inodeId = inodeId;
  }

  public long getBlockId() {
    return blockId;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }
  
  public int getInodeId() {
    return inodeId;
  }

  public void setBlockId(long blockId) {
    this.blockId = blockId;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }
  
  @Override
  public String toString() {
    return "UnderReplicatedBlock{" + "level=" + level + ", blockId=" + blockId +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final UnderReplicatedBlock other = (UnderReplicatedBlock) obj;
    if (this.blockId != other.blockId) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 37 * hash + (int) (this.blockId ^ (this.blockId >>> 32));
    return hash;
  }

}
