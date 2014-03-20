package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing RMContainer class.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContainer {

    private int id;
    private int containerIdID;
    private int applicationAttemptIdID;
    private int nodeIdID;
    private int containerID;
    private int reservedResourceID;
    private int reservedNodeIdID;
    private int reservedPriorityID;
    private String state;
    private int newlyAllocated;

    public HopRMContainer(int id, int containerIdID, int applicationAttemptIdID, int nodeIdID, int containerID, int reservedResourceID, int reservedNodeIdID, int reservedPriorityID, String state, int newlyAllocated) {
        this.id = id;
        this.containerIdID = containerIdID;
        this.applicationAttemptIdID = applicationAttemptIdID;
        this.nodeIdID = nodeIdID;
        this.containerID = containerID;
        this.reservedResourceID = reservedResourceID;
        this.reservedNodeIdID = reservedNodeIdID;
        this.reservedPriorityID = reservedPriorityID;
        this.state = state;
        this.newlyAllocated = newlyAllocated;
    }

    public int getId() {
        return id;
    }

    public int getContainerIdID() {
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

    public int getReservedResourceID() {
        return reservedResourceID;
    }

    public int getReservedNodeIdID() {
        return reservedNodeIdID;
    }

    public int getReservedPriorityID() {
        return reservedPriorityID;
    }

    public String getState() {
        return state;
    }

    public int getNewlyAllocated() {
        return newlyAllocated;
    }
}
