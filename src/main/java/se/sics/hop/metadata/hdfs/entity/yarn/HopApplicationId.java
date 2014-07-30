package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationId {

    private final int id;
    private final long clustertimestamp;
    //private int finished;

    public HopApplicationId(int id, long clustertimestamp) {
        this.id = id;
        this.clustertimestamp = clustertimestamp;
    }

    public int getId() {
        return id;
    }

    public long getClustertimestamp() {
        return clustertimestamp;
    }

    /**
     * Denotes if this ApplicationId is in the finishedApplictions map of
     * RMNODe.
     *
     * @return
     */
//    public int getFinished() {
//        return finished;
//    }
}
