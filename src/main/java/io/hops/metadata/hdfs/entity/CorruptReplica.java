package io.hops.metadata.hdfs.entity;

import io.hops.metadata.common.FinderType;

public class CorruptReplica extends Replica {

  public static enum Finder implements FinderType<CorruptReplica> {

    ByINodeId, ByINodeIds,
    ByBlockIdAndINodeId;

    @Override
    public Class getType() {
      return CorruptReplica.class;
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

  public CorruptReplica(long blockId, int storageId, int inodeId) {
    super(storageId, blockId, inodeId);
  }
}
