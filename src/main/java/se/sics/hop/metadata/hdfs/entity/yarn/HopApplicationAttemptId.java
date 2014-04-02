package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationAttemptId {

    private int ndbId;
    private int attemptId;
    private int applicationidId;

    public HopApplicationAttemptId(int ndbId, int id, int applicationid) {
        this.ndbId = ndbId;
        this.attemptId = id;
        this.applicationidId = applicationid;
    }

    public int getNdbId() {
        return ndbId;
    }

    public int getAttemptId() {
        return attemptId;
    }

    public int getApplicationidId() {
        return applicationidId;
    }
}
