package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing RMContainer class.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContainer {

    private final String containerIdID;
    private final String applicationAttemptIdID;
    private final String nodeIdID;
    private final String user;
    private final String reservedNodeIdID;
    private final int reservedPriorityID;
    private final long starttime;
    private final long finishtime;

    public HopRMContainer(String containerIdID, String applicationAttemptIdID, String nodeIdID, String user, String reservedNodeIdID, int reservedPriorityID, long starttime, long finishtime) {
        this.containerIdID = containerIdID;
        this.applicationAttemptIdID = applicationAttemptIdID;
        this.nodeIdID = nodeIdID;
        this.user = user;
        this.reservedNodeIdID = reservedNodeIdID;
        this.reservedPriorityID = reservedPriorityID;
        this.starttime = starttime;
        this.finishtime = finishtime;
    }

    public String getContainerIdID() {
        return containerIdID;
    }

    public String getApplicationAttemptIdID() {
        return applicationAttemptIdID;
    }

    public String getNodeIdID() {
        return nodeIdID;
    }

    public String getUser() {
        return user;
    }

    public String getReservedNodeIdID() {
        return reservedNodeIdID;
    }

    public int getReservedPriorityID() {
        return reservedPriorityID;
    }

    public long getStarttime() {
        return starttime;
    }

    public long getFinishtime() {
        return finishtime;
    }
}
