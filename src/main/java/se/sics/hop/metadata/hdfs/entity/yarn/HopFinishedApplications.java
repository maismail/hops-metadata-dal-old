package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo for RMNode.finishedApplications list.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
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
}
