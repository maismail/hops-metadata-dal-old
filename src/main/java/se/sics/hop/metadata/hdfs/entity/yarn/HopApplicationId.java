package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopApplicationId {

    private final String id;
    private final int appid;
    private final long clustertimestamp;

    public HopApplicationId(String id, int appid, long clustertimestamp) {
        this.id = id;
        this.appid = appid;
        this.clustertimestamp = clustertimestamp;
    }

    public String getId() {
        return id;
    }

    public int getAppid() {
        return appid;
    }

    public long getClustertimestamp() {
        return clustertimestamp;
    }
}
