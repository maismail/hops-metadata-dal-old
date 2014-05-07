package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.CounterType;
import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public class HopInvalidatedBlock extends HopReplica {

//  public static enum Counter implements CounterType<HopInvalidatedBlock> {
//
//    All;
//
//    @Override
//    public Class getType() {
//      return HopInvalidatedBlock.class;
//    }
//  }

  public static enum Finder implements FinderType<HopInvalidatedBlock> {

    ByBlockId, ByINodeId, ByStorageId, ByPK, All;

    @Override
    public Class getType() {
      return HopInvalidatedBlock.class;
    }
  }
  private long generationStamp;
  private long numBytes;
  private int inodeId;
  private int partKey;
  

  public HopInvalidatedBlock(int storageId, long blockId, int inodeId, int partKey) {
    super(storageId, blockId);
    this.inodeId = inodeId;
    this.partKey = partKey;
  }

  public HopInvalidatedBlock(int storageId, long blockId, long generationStamp, long numBytes, int inodeId, int partKey) {
    super(storageId, blockId);
    this.generationStamp = generationStamp;
    this.numBytes = numBytes;
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
