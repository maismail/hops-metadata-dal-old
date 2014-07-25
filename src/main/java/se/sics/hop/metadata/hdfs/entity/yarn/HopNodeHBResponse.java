package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNodeHBResponse {

    private final int id;
    private final byte[] responseid;

    public HopNodeHBResponse(int id, byte[] responseid) {
        this.id = id;
        this.responseid = responseid;
    }

    public int getId() {
        return id;
    }

    public byte[] getResponseid() {
        return responseid;
    }
}
