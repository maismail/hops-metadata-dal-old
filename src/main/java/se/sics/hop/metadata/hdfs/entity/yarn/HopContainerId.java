package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerId {

    private final int id;
    private final int applicationAttemptId;

    public HopContainerId(int id, int applicationAttemptId) {
        this.id = id;
        this.applicationAttemptId = applicationAttemptId;
    }

    public int getId() {
        return id;
    }

    public int getApplicationAttemptId() {
        return applicationAttemptId;
    }
}
