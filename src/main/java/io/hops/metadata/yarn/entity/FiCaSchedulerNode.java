package io.hops.metadata.yarn.entity;

/**
 * Pojo class representing FicaSchedulerNode
 */
public class FiCaSchedulerNode {

  private String rmnodeId;
  private String nodeName;
  private int numOfContainers;

  public FiCaSchedulerNode(String rmnodeId, String nodeName,
      int numOfContainers) {
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
