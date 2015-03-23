package io.hops.metadata.hdfs.entity.yarn;

/**
 * Pojo class representing FicaSchedulerNode
 */
public class HopFiCaSchedulerNode {

    private String rmnodeId;
    private String nodeName;
    private int numOfContainers;

    public HopFiCaSchedulerNode(String rmnodeId, String nodeName, int numOfContainers) {
        this.rmnodeId = rmnodeId;
        this.nodeName = nodeName;
        this.numOfContainers = numOfContainers;
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
}
