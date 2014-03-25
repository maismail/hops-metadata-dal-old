package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo class representing FicaSchedulerNode
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopFiCaSchedulerNode {

    private int id;
    private int availableResourceID;
    private int usedResourceID;
    private int totalCapabilityID;
    private int numOfContainers;
    private int rmNodeID;
    private String nodeName;

    public HopFiCaSchedulerNode(int id, int availableResourceID, int usedResourceID, int totalCapabilityID, int numOfContainers, int rmNodeID, String nodeName) {
        this.id = id;
        this.availableResourceID = availableResourceID;
        this.usedResourceID = usedResourceID;
        this.totalCapabilityID = totalCapabilityID;
        this.numOfContainers = numOfContainers;
        this.rmNodeID = rmNodeID;
        this.nodeName = nodeName;
    }

    public int getId() {
        return id;
    }

    public int getAvailableResourceID() {
        return availableResourceID;
    }

    public int getUsedResourceID() {
        return usedResourceID;
    }

    public int getTotalCapabilityID() {
        return totalCapabilityID;
    }

    public int getNumOfContainers() {
        return numOfContainers;
    }

    public int getRmNodeID() {
        return rmNodeID;
    }

    public String getNodeName() {
        return nodeName;
    }
}
