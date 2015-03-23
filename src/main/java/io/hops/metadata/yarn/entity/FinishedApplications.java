package io.hops.metadata.yarn.entity;

/**
 * Pojo for RMNode.finishedApplications list.
 */
public class FinishedApplications {

  private final String rmnodeid;
  private final String applicationId;

  public FinishedApplications(String rmnodeid, String applicationId) {
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
