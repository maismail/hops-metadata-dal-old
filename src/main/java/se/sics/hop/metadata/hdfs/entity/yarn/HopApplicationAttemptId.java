package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationAttemptId {

    private final String attemptId;
    private final String appid;

    public HopApplicationAttemptId(String attemptId, String appid) {
        this.attemptId = attemptId;
        this.appid = appid;
    }

    public String getAttemptId() {
        return attemptId;
    }

    public String getAppid() {
        return appid;
    }
}
