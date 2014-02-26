package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.CounterType;
import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author jude
 */
public class HopCorruptReplica extends HopReplica {

  public static enum Counter implements CounterType<HopCorruptReplica> {

    All;

    @Override
    public Class getType() {
      return HopCorruptReplica.class;
    }
  }

  public static enum Finder implements FinderType<HopCorruptReplica> {

    All, ByBlockId, ByPk;

    @Override
    public Class getType() {
      return HopCorruptReplica.class;
    }
  }

  public HopCorruptReplica(long blockId, int storageId) {
    super(storageId, blockId);
  }
//  public String persistanceKey() {
//    return blockId + storageId;
//  }
}
