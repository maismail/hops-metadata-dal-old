package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNodeHBResponse {

    private final int id;
    private final int responseid;

    public HopNodeHBResponse(int id, int responseid) {
        this.id = id;
        this.responseid = responseid;
    }

    public int getId() {
        return id;
    }

    public int getResponseid() {
        return responseid;
    }
}
