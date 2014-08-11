package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo class representing FicaSchedulerNode
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopFiCaSchedulerNode {

    private String rmnodeId;
    private String nodeName;
    private int numOfContainers;
    private String rmcontainerId;

    public HopFiCaSchedulerNode(String rmnodeId, String nodeName, int numOfContainers, String rmcontainerId) {
        this.rmnodeId = rmnodeId;
        this.nodeName = nodeName;
        this.numOfContainers = numOfContainers;
        this.rmcontainerId = rmcontainerId;
    }

    public String getRmnodeId() {
        return rmnodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public int getNumOfContainers() {
        return numOfContainers;
    }

    public String getRmcontainerId() {
        return rmcontainerId;
    }
}
