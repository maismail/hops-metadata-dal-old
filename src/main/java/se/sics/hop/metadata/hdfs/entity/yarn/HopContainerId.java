package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerId {

    private final int containerId;
    private final int applicationAttemptId;

    public HopContainerId(int containerId, int applicationAttemptId) {
        this.containerId = containerId;
        this.applicationAttemptId = applicationAttemptId;
    }

    public int getContainerId() {
        return containerId;
    }

    public int getApplicationAttemptId() {
        return applicationAttemptId;
    }
}
