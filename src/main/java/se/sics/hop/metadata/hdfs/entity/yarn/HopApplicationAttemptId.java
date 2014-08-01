package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationAttemptId {

    private final int attemptId;
    private final int appid;

    public HopApplicationAttemptId(int attemptId, int appid) {
        this.attemptId = attemptId;
        this.appid = appid;
    }

    public int getAttemptId() {
        return attemptId;
    }

    public int getAppid() {
        return appid;
    }
}
