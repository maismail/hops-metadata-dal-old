/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.hdfs;

import se.sics.hop.metadata.hdfs.entity.hop.HopReplica;

/**
 *
 * @author salman
 */
public class HopINodeCandidatePK  implements Comparable<HopINodeCandidatePK>{

  int inodeId;
  int partKey;

  public HopINodeCandidatePK(int inodeId, int partKey) {
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

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof HopINodeCandidatePK) {
      HopINodeCandidatePK other = (HopINodeCandidatePK) obj;
      if (this.inodeId == other.inodeId && this.partKey == other.partKey) {
        return true;
      }
    }
    return false;
  }
  
  
  @Override
  public String toString() {
    return "Id:"+inodeId+" "+"partKey:"+partKey+" ";
  }


  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + this.inodeId;
    hash = 59 * hash + (int) (this.partKey ^ (this.partKey >>> 32));
    return hash;
  }

  
  @Override
  public int compareTo(HopINodeCandidatePK t) {
    if (this.equals(t)) {
      return 0;
    }

    if (this.getInodeId() == t.getInodeId()) {
      if (this.getPartKey() > t.getPartKey()) {
        return 1;
      } else {
        return -1;
      }
    } else {
      if (this.getInodeId() > t.getInodeId()) {
        return 1;
      } else {
        return -1;
      }
    }
  }
  
  
}
