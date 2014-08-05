package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainer {

    private String containerIdID;
    private int nodeIdID;
    private String nodehttpaddress;
    private int resourceID;
    private int priorityID;
    private int tokenID;

    public HopContainer(String containerIdID, int nodeIdID, String nodehttpaddress, int resourceID, int priorityID, int tokenID) {
        this.containerIdID = containerIdID;
        this.nodeIdID = nodeIdID;
        this.nodehttpaddress = nodehttpaddress;
        this.resourceID = resourceID;
        this.priorityID = priorityID;
        this.tokenID = tokenID;
    }

    public String getContainerIdID() {
        return containerIdID;
    }

    public int getNodeIdID() {
        return nodeIdID;
    }

    public String getNodehttpaddress() {
        return nodehttpaddress;
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
