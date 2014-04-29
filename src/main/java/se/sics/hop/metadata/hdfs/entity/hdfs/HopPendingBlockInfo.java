package se.sics.hop.metadata.hdfs.entity.hdfs;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopPendingBlockInfo {

  private long blockId;
  private int inodeId;
  private int partKey;
  private long timeStamp;
  private int numReplicas;

  public HopPendingBlockInfo(long blockId, int inodeId, int partKey, long timestamp, int numReplicas) {
    this.blockId = blockId;
    this.inodeId = inodeId;
    this.partKey = partKey;
    this.timeStamp = timestamp;
    this.numReplicas = numReplicas;
  }

  public long getBlockId() {
    return blockId;
  }

  public int getInodeId() {
    return inodeId;
  }

  public int getPartKey() {
    return partKey;
  }

  public void setBlockId(long blockId) {
    this.blockId = blockId;
  }

  public long getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(long timeStamp) {
    this.timeStamp = timeStamp;
  }

  public int getNumReplicas() {
    return numReplicas;
  }

  public void setNumReplicas(int numReplicas) {
    this.numReplicas = numReplicas;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }

  public void setPartKey(int partKey) {
    this.partKey = partKey;
  }
  
}
