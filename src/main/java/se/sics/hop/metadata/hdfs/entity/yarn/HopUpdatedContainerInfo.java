package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopUpdatedContainerInfo {

    private final String rmnodeid;
    private final String containerId;

    public HopUpdatedContainerInfo(String rmnodeid, String containerId) {
        this.rmnodeid = rmnodeid;
        this.containerId = containerId;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

    public String getContainerId() {
        return containerId;
    }
}
