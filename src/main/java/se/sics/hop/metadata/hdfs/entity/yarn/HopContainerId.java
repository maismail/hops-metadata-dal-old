package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerId {

    private final int id;
    private final int applicationAttemptId;
    private final boolean toClean;

    public HopContainerId(int id, int applicationAttemptId, boolean toClean) {
        this.id = id;
        this.applicationAttemptId = applicationAttemptId;
        this.toClean = toClean;
    }

    public int getId() {
        return id;
    }

    public int getApplicationAttemptId() {
        return applicationAttemptId;
    }

    public boolean isToClean() {
        return toClean;
    }
}
