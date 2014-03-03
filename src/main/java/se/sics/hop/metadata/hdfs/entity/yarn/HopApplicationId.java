package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationId {

    private int id;
    private long clustertimestamp;

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
}
