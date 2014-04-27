package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Represents a row in the ha_invokerequests table that stores requests to be
 * sent from secondary RMs to the scheduler.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class InvokeRequest {

    private int id;
    private int nodeid;
    private int type;

    public InvokeRequest(int id, int nodeid, int type) {
        this.id = id;
        this.nodeid = nodeid;
        this.type = type;
    }

    public InvokeRequest(int nodeid, int type) {
        this.nodeid = nodeid;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getNodeid() {
        return nodeid;
    }

    public int getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "InvokeRequest{" + "id=" + id + ", nodeid=" + nodeid + ", type=" + type + '}';
    }
}
