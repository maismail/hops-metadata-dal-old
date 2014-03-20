package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainer {

    private int id;
    private int containerIdID;
    private int nodeIdID;
    private int resourceID;
    private int priorityID;
    private int tokenID;

    public HopContainer(int id, int containerIdID, int nodeIdID, int resourceID, int priorityID, int tokenID) {
        this.id = id;
        this.containerIdID = containerIdID;
        this.nodeIdID = nodeIdID;
        this.resourceID = resourceID;
        this.priorityID = priorityID;
        this.tokenID = tokenID;
    }

    public int getId() {
        return id;
    }

    public int getContainerIdID() {
        return containerIdID;
    }

    public int getNodeIdID() {
        return nodeIdID;
    }

    public int getResourceID() {
        return resourceID;
    }

    public int getPriorityID() {
        return priorityID;
    }

    public int getTokenID() {
        return tokenID;
    }
}
