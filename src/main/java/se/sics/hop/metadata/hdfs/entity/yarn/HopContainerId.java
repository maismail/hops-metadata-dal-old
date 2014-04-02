package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerId {

    private final int ndbId;
    private final int contid;
    private final int applicationAttemptId;
    private final int toClean;

    public HopContainerId(int ndbId, int contid, int applicationAttemptId, int toClean) {
        this.ndbId = ndbId;
        this.contid = contid;
        this.applicationAttemptId = applicationAttemptId;
        this.toClean = toClean;
    }

    public int getNdbId() {
        return ndbId;
    }

    public int getContid() {
        return contid;
    }

    public int getApplicationAttemptId() {
        return applicationAttemptId;
    }

    public int getToClean() {
        return toClean;
    }
}
