package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationAttemptId {

    private int id;
    private int applicationid;

    public HopApplicationAttemptId(int id, int applicationid) {
        this.id = id;
        this.applicationid = applicationid;
    }

    public int getId() {
        return id;
    }

    public int getApplicationid() {
        return applicationid;
    }
}
