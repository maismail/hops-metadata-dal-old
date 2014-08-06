package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing RMContainer class.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContainer {

    private final String containerIdID;
    private final int applicationAttemptIdID;
    private final int nodeIdID;
    private final int containerID;
    private final int rmcontextID;
    private final String user;
    private final int reservedResourceID;
    private final int reservedNodeIdID;
    private final int reservedPriorityID;
    private final long starttime;
    private final long finishtime;
    private final int containerstatus_id;

    public HopRMContainer(String containerIdID, int applicationAttemptIdID, int nodeIdID, int containerID, int rmcontextID, String user, int reservedResourceID, int reservedNodeIdID, int reservedPriorityID, long starttime, long finishtime, int containerstatus_id) {
        this.containerIdID = containerIdID;
        this.applicationAttemptIdID = applicationAttemptIdID;
        this.nodeIdID = nodeIdID;
        this.containerID = containerID;
        this.rmcontextID = rmcontextID;
        this.user = user;
        this.reservedResourceID = reservedResourceID;
        this.reservedNodeIdID = reservedNodeIdID;
        this.reservedPriorityID = reservedPriorityID;
        this.starttime = starttime;
        this.finishtime = finishtime;
        this.containerstatus_id = containerstatus_id;
    }

    public String getContainerIdID() {
        return containerIdID;
    }

    public int getApplicationAttemptIdID() {
        return applicationAttemptIdID;
    }

    public int getNodeIdID() {
        return nodeIdID;
    }

    public int getContainerID() {
        return containerID;
    }

    public int getRmcontextID() {
        return rmcontextID;
    }

    public String getUser() {
        return user;
    }

    public int getReservedResourceID() {
        return reservedResourceID;
    }

    public int getReservedNodeIdID() {
        return reservedNodeIdID;
    }

    public int getReservedPriorityID() {
        return reservedPriorityID;
    }

    public long getStarttime() {
        return starttime;
    }

    public long getFinishtime() {
        return finishtime;
    }

    public int getContainerstatus_id() {
        return containerstatus_id;
    }
}
