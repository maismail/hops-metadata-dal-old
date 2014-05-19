package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.CounterType;
import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public class HopExcessReplica extends HopReplica {

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

  public HopExcessReplica(int storageId, long blockId, int inodeId) {
    super(storageId, blockId, inodeId, -1);
  }
}
