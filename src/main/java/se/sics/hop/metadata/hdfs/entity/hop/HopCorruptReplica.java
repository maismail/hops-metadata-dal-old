package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.CounterType;
import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author jude
 */
public class HopCorruptReplica extends HopReplica {

  private int inodeId;
  private int partKey;
  
  public static enum Counter implements CounterType<HopCorruptReplica> {

    All;

    @Override
    public Class getType() {
      return HopCorruptReplica.class;
    }
  }

  public static enum Finder implements FinderType<HopCorruptReplica> {

    All, ByINodeId, ByBlockId, ByPk;

    @Override
    public Class getType() {
      return HopCorruptReplica.class;
    }
  }

  public int getInodeId() {
    return inodeId;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }

  public int getPartKey() {
    return partKey;
  }

  public void setPartKey(int partKey) {
    this.partKey = partKey;
  }

  public HopCorruptReplica(long blockId, int storageId, int inodeId, int partKey) {
    super(storageId, blockId);
    this.inodeId = inodeId;
    this.partKey = partKey;
  }
//  public String persistanceKey() {
//    return blockId + storageId;
//  }
}
