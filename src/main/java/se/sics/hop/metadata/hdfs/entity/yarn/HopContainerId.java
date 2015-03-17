package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo class for the RMNode.containersToClean set. Hostname, commandport point
 * to the RMNode primary key.
 */
public class HopContainerId {

    private String rmnodeid;
    private String containerId;

    public HopContainerId(String rmnodeid, String containerId) {
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
