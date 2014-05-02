package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.CounterType;
import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public class HopExcessReplica extends HopReplica {

  private int inodeId;
  private int partKey;
//  public static enum Counter implements CounterType<HopExcessReplica> {
//
//    All;
//
//    @Override
//    public Class getType() {
//      return HopExcessReplica.class;
//    }
//  }

  public static enum Finder implements FinderType<HopExcessReplica> {

    ByPKey, ByBlockId, ByINodeId;

    @Override
    public Class getType() {
      return HopExcessReplica.class;
    }
  }

  public HopExcessReplica(int storageId, long blockId, int inodeId, int partKey) {
    super(storageId, blockId);
    this.inodeId = inodeId;
    this.partKey = partKey;
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
  
  
}
