package io.hops.metadata.hdfs.entity;

import io.hops.metadata.common.FinderType;

public class InvalidatedBlock extends Replica {

  public static enum Finder implements FinderType<InvalidatedBlock> {

    ByBlockIdAndINodeId, ByINodeId, ByINodeIds,
    ByBlockIdStorageIdAndINodeId,
    ByBlockIdsStorageIdsAndINodeIds, All;

    @Override
    public Class getType() {
      return InvalidatedBlock.class;
    }

    @Override
    public Annotation getAnnotated() {
      switch (this){
        case ByBlockIdAndINodeId: return Annotation.PrunedIndexScan;
        case ByINodeId: return Annotation.PrunedIndexScan;
        case ByINodeIds: return Annotation.BatchedPrunedIndexScan;
        case ByBlockIdStorageIdAndINodeId: return Annotation.PrimaryKey;
        case ByBlockIdsStorageIdsAndINodeIds: return Annotation.Batched;
        case All: return Annotation.FullTable;
        default: throw new IllegalStateException();
      }
    }

  }
  private long generationStamp;
  private long numBytes;
  

  public InvalidatedBlock(int storageId, long blockId, int inodeId) {
    super(storageId, blockId, inodeId);
  }

  public InvalidatedBlock(int storageId, long blockId, long generationStamp,
      long numBytes, int inodeId) {
    super(storageId, blockId, inodeId);
    this.generationStamp = generationStamp;
    this.numBytes = numBytes;
  }

  /**
   * @return the generationStamp
   */
  public long getGenerationStamp() {
    return generationStamp;
  }

  /**
   * @param generationStamp the generationStamp to set
   */
  public void setGenerationStamp(long generationStamp) {
    this.generationStamp = generationStamp;
  }

  /**
   * @return the numBytes
   */
  public long getNumBytes() {
    return numBytes;
  }

  /**
   * @param numBytes the numBytes to set
   */
  public void setNumBytes(long numBytes) {
    this.numBytes = numBytes;
  }
}
