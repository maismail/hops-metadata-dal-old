package se.sics.hop.metadata.entity.hop;

import java.util.Collections;
import java.util.Comparator;
import se.sics.hop.metadata.entity.CounterType;
import se.sics.hop.metadata.entity.FinderType;

public class HopUnderReplicatedBlock {
  public static enum Counter implements CounterType<HopUnderReplicatedBlock> {
    All, ByLevel, LessThanLevel;

    @Override
    public Class getType() {
      return HopUnderReplicatedBlock.class;
    }
    
  }
  public static enum Finder implements FinderType<HopUnderReplicatedBlock> {

    ByBlockId, All, ByLevel;

    @Override
    public Class getType() {
      return HopUnderReplicatedBlock.class;
    }
    
  }
  
  public static enum Order implements Comparator<HopUnderReplicatedBlock> {

    ByLevel() {

      @Override
      public int compare(HopUnderReplicatedBlock o1, HopUnderReplicatedBlock o2) {
        if (o1.getLevel() < o2.level) {
          return -1;
        } else {
          return 1;
        }
      }
    };
    
    @Override
    public abstract int compare(HopUnderReplicatedBlock o1, HopUnderReplicatedBlock o2);

    public Comparator acsending() {
      return this;
    }

    public Comparator descending() {
      return Collections.reverseOrder(this);
    }
  }

  int level;
  long blockId;

  public HopUnderReplicatedBlock(int level, long blockId) {
    this.level = level;
    this.blockId = blockId;
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

  @Override
  public String toString() {
    return "UnderReplicatedBlock{" + "level=" + level + ", blockId=" + blockId + '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final HopUnderReplicatedBlock other = (HopUnderReplicatedBlock) obj;
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
