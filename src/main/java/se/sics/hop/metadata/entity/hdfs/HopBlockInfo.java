/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.entity.hdfs;

/**
 *
 * @author salman
 */
public class HopBlockInfo {

  private long blockId;
  private int blockIndex;
  private long inodeId;
  private long numBytes;
  private long generationStamp;
  private int blockUCState;
  private long timeStamp;
  private int primaryNodeIndex;
  private long blockRecoveryId;

  public HopBlockInfo(long blockId, int blockIndex, long inodeId, long numBytes, long generationStamp, int blockUnderConstructionState, long timeStamp) {
    this.blockId = blockId;
    this.blockIndex = blockIndex;
    this.inodeId = inodeId;
    this.numBytes = numBytes;
    this.generationStamp = generationStamp;
    this.blockUCState = blockUnderConstructionState;
    this.timeStamp = timeStamp;
  }

  public HopBlockInfo(long blockId, int blockIndex, long inodeId, long numBytes, long generationStamp, int blockUnderConstructionState, long timeStamp, int primaryNodeIndex, long blockRecoveryId) {
    this(blockId, blockIndex, inodeId, numBytes, generationStamp, blockUnderConstructionState, timeStamp);
    this.primaryNodeIndex = primaryNodeIndex;
    this.blockRecoveryId = blockRecoveryId;
  }

  public long getBlockId() {
    return blockId;
  }

  public int getBlockIndex() {
    return blockIndex;
  }

  public long getInodeId() {
    return inodeId;
  }

  public long getNumBytes() {
    return numBytes;
  }

  public long getGenerationStamp() {
    return generationStamp;
  }

  public int getBlockUCState() {
    return blockUCState;
  }

  public long getTimeStamp() {
    return timeStamp;
  }

  public int getPrimaryNodeIndex() {
    return primaryNodeIndex;
  }

  public long getBlockRecoveryId() {
    return blockRecoveryId;
  }

  public void setBlockId(long blockId) {
    this.blockId = blockId;
  }

  public void setBlockIndex(int blockIndex) {
    this.blockIndex = blockIndex;
  }

  public void setInodeId(long inodeId) {
    this.inodeId = inodeId;
  }

  public void setNumBytes(long numBytes) {
    this.numBytes = numBytes;
  }

  public void setGenerationStamp(long generationStamp) {
    this.generationStamp = generationStamp;
  }

  public void setBlockUCState(int blockUCState) {
    this.blockUCState = blockUCState;
  }

  public void setTimeStamp(long timeStamp) {
    this.timeStamp = timeStamp;
  }

  public void setPrimaryNodeIndex(int primaryNodeIndex) {
    this.primaryNodeIndex = primaryNodeIndex;
  }

  public void setBlockRecoveryId(long blockRecoveryId) {
    this.blockRecoveryId = blockRecoveryId;
  }
}
