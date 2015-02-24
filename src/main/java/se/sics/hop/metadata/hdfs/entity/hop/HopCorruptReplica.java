package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author jude
 */
public class HopCorruptReplica extends HopReplica {

  public static enum Finder implements FinderType<HopCorruptReplica> {

    ByINodeId, ByINodeIds,
    ByBlockIdAndINodeId;

    @Override
    public Class getType() {
      return HopCorruptReplica.class;
    }

    @Override
    public Annotation getAnnotated() {
      switch (this){
          case ByBlockIdAndINodeId: return Annotation.PrunedIndexScan;
          case ByINodeId: return Annotation.PrunedIndexScan;
          case ByINodeIds: return Annotation.BatchedPrunedIndexScan;
          default: throw new IllegalStateException();
      }
    }

  }

  public HopCorruptReplica(long blockId, int storageId, int inodeId) {
    super(storageId, blockId, inodeId);
  }
}
