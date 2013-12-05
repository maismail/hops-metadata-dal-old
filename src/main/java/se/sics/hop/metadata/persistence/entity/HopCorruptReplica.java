package se.sics.hop.metadata.persistence.entity;

import se.sics.hop.metadata.persistence.CounterType;
import se.sics.hop.metadata.persistence.FinderType;

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

  public HopCorruptReplica(long blockId, String storageId) {
    super(storageId, blockId);
  }
//  public String persistanceKey() {
//    return blockId + storageId;
//  }
}
