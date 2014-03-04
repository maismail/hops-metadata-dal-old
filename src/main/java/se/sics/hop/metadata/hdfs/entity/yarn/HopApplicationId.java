package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationId {

    private int id;
    private long clustertimestamp;
    private int finished;

    public HopApplicationId(int id, long clustertimestamp, int finished) {
        this.id = id;
        this.clustertimestamp = clustertimestamp;
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public long getClustertimestamp() {
        return clustertimestamp;
    }

    /**
     * Denotes if this ApplicationId is in the finishedApplictions map of RMNODe.
     * @return 
     */
    public int getFinished() {
        return finished;
    }
}
