package io.hops.metadata.hdfs.entity.yarn;

/**
 * Pojo for RMNode.finishedApplications list.
 */
public class HopFinishedApplications {

  private final String rmnodeid;
  private final String applicationId;

  public HopFinishedApplications(String rmnodeid, String applicationId) {
    this.rmnodeid = rmnodeid;
    this.applicationId = applicationId;
  }

  public String getRMNodeID() {
    return rmnodeid;
  }

  public String getApplicationId() {
    return applicationId;
  }

  @Override
  public String toString() {
    return "HopFinishedApplications{" + "rmnodeid=" + rmnodeid
            + ", applicationId=" + applicationId + '}';
  }

}
