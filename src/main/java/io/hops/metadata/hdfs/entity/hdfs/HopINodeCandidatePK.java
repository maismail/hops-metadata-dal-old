package io.hops.metadata.hdfs.entity.hdfs;

public class HopINodeCandidatePK  implements Comparable<HopINodeCandidatePK>{

  int inodeId;

  public HopINodeCandidatePK(int inodeId) {
    this.inodeId = inodeId;
  }

  public int getInodeId() {
    return inodeId;
  }

  public void setInodeId(int inodeId) {
    this.inodeId = inodeId;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof HopINodeCandidatePK) {
      HopINodeCandidatePK other = (HopINodeCandidatePK) obj;
      if (this.inodeId == other.inodeId) {
        return true;
      }
    }
    return false;
  }


  @Override
  public String toString() {
    return "Id:"+inodeId;
  }


  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + this.inodeId;
    return hash;
  }


  @Override
  public int compareTo(HopINodeCandidatePK t) {
    if (this.equals(t)) {
      return 0;
    }

      if (this.getInodeId() > t.getInodeId()) {
        return 1;
      } else {
        return -1;
      }
  }


}
