package io.hops.metadata.hdfs.entity.hop;

import io.hops.metadata.hdfs.entity.FinderType;
import io.hops.metadata.hdfs.entity.FinderType;

public class HopExcessReplica extends HopReplica {

  public static enum Finder implements FinderType<HopExcessReplica> {

    ByBlockIdStorageIdAndINodeId,
    ByBlockIdAndINodeId, ByINodeId, ByINodeIds;

    @Override
    public Class getType() {
      return HopExcessReplica.class;
    }

    @Override
    public Annotation getAnnotated() {
      switch (this){
        case ByBlockIdStorageIdAndINodeId: return Annotation.PrimaryKey;
        case ByBlockIdAndINodeId: return Annotation.PrunedIndexScan;
        case ByINodeId: return Annotation.PrunedIndexScan;
        case ByINodeIds: return Annotation.BatchedPrunedIndexScan;
        default: throw new IllegalStateException();
      }
    }

  }

  public HopExcessReplica(int storageId, long blockId, int inodeId) {
    super(storageId, blockId, inodeId);
  }
}
