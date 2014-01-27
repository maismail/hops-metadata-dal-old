package se.sics.hop.metadata.entity.hdfs;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopPendingBlockInfo {

  private long blockId;
  private long timeStamp;
  private int numReplicas;

  public HopPendingBlockInfo(long blockId, long timestamp, int numReplicas) {
    this.blockId = blockId;
    this.timeStamp = timestamp;
    this.numReplicas = numReplicas;
  }

  public long getBlockId() {
    return blockId;
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
}
