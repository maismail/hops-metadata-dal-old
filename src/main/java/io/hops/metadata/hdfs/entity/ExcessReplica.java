package io.hops.metadata.hdfs.entity;

import io.hops.metadata.common.FinderType;

public class ExcessReplica extends Replica {

  public static enum Finder implements FinderType<ExcessReplica> {

    ByBlockIdStorageIdAndINodeId,
    ByBlockIdAndINodeId,
    ByINodeId,
    ByINodeIds;

    @Override
    public Class getType() {
      return ExcessReplica.class;
    }

    @Override
    public Annotation getAnnotated() {
      switch (this) {
        case ByBlockIdStorageIdAndINodeId:
          return Annotation.PrimaryKey;
        case ByBlockIdAndINodeId:
          return Annotation.PrunedIndexScan;
        case ByINodeId:
          return Annotation.PrunedIndexScan;
        case ByINodeIds:
          return Annotation.BatchedPrunedIndexScan;
        default:
          throw new IllegalStateException();
      }
    }

  }

  public ExcessReplica(int storageId, long blockId, int inodeId) {
    super(storageId, blockId, inodeId);
  }
}
