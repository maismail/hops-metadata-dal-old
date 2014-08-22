package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerId {

    private final String id;
    private final int containerId;
    private final String applicationAttemptId;

    public HopContainerId(String id, int containerId, String applicationAttemptId) {
        this.id = id;
        this.containerId = containerId;
        this.applicationAttemptId = applicationAttemptId;
    }

    public String getId() {
        return id;
    }

    public int getContainerId() {
        return containerId;
    }

    public String getApplicationAttemptId() {
        return applicationAttemptId;
    }
}
