package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo class representing FicaSchedulerNode
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopFiCaSchedulerNode {

    private String nodeName;
    private int numOfContainers;
    private String rmNodeID;

    public HopFiCaSchedulerNode(String nodeName, int numOfContainers, String rmNodeID) {
        this.nodeName = nodeName;
        this.numOfContainers = numOfContainers;
        this.rmNodeID = rmNodeID;
    }

    public String getNodeName() {
        return nodeName;
    }

    public int getNumOfContainers() {
        return numOfContainers;
    }

    public String getRmNodeID() {
        return rmNodeID;
    }
}
