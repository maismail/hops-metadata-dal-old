package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopUpdatedContainerInfo {

    private final String rmnodeid;
    private final String containerId;
    private final int updatedContainerInfoId;

    public HopUpdatedContainerInfo(String rmnodeid, String containerId,
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
}
