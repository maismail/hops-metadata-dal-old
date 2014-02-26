/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.hdfs;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopReplicaUnderConstruction {

  private long blockId;
  private int storageId;
  private int index;
  private int state;

  public HopReplicaUnderConstruction(int state, int storageId, long blockId, int index) {
    this.state = state;
    this.storageId = storageId;
    this.blockId = blockId;
    this.index = index;
  }

  public long getBlockId() {
    return blockId;
  }

  public void setBlockId(long blockId) {
    this.blockId = blockId;
  }

  public int getStorageId() {
    return storageId;
  }

  public void setStorageId(int storageId) {
    this.storageId = storageId;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }
}
