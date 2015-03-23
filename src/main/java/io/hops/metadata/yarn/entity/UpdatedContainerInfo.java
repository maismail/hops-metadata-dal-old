package io.hops.metadata.yarn.entity;

public class UpdatedContainerInfo {

  private final String rmnodeid;
  private final String containerId;
  private final int updatedContainerInfoId;

  public UpdatedContainerInfo(String rmnodeid, String containerId,
      int updatedContainerInfoId) {
    this.rmnodeid = rmnodeid;
    this.containerId = containerId;
    this.updatedContainerInfoId = updatedContainerInfoId;
  }

  public String getRmnodeid() {
    return rmnodeid;
  }

  public String getContainerId() {
    return containerId;
  }

  public int getUpdatedContainerInfoId() {
    return updatedContainerInfoId;
  }

  @Override
  public String toString() {
    return "HopUpdatedContainerInfo{" + "rmnodeid=" + rmnodeid + ", containerId=" +
            containerId + ", updatedContainerInfoId=" + updatedContainerInfoId +
            '}';
  }

  @Override
  public int hashCode() {
    int hash = 3;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final UpdatedContainerInfo other = (UpdatedContainerInfo) obj;
    if ((this.rmnodeid == null) ? (other.rmnodeid != null)
            : !this.rmnodeid.equals(other.rmnodeid)) {
      return false;
    }
    if ((this.containerId == null) ? (other.containerId != null)
            : !this.containerId.equals(other.containerId)) {
      return false;
    }
    if (this.updatedContainerInfoId != other.updatedContainerInfoId) {
      return false;
    }
    return true;
  }
  
}
