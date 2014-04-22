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
  private int inodeId;
  private int partKey;
  private int index;
  private int state;

  public HopReplicaUnderConstruction(int state, int storageId, long blockId, int inodeId, int partKey, int index) {
    this.state = state;
    this.storageId = storageId;
    this.blockId = blockId;
    this.index = index;
    this.inodeId = inodeId;
    this.partKey = partKey;
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

  public int getInodeId() {
    return inodeId;
  }

  public int getPartKey() {
    return partKey;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }

  public void setPartKey(int partKey) {
    this.partKey = partKey;
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
