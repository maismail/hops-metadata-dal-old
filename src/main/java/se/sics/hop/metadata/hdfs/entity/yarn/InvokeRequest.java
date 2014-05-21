package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Represents a row in the ha_invokerequests table that stores requests to be
 * sent from secondary RMs to the scheduler.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class InvokeRequest {

    private int nodeid;
    private int type;
    private int status;

    public InvokeRequest(int nodeid, int type, int status) {
        this.nodeid = nodeid;
        this.type = type;
        this.status = status;
    }

    public int getNodeid() {
        return nodeid;
    }

    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InvokeRequest{" + "nodeid=" + nodeid + ", type=" + type + ", status=" + status + '}';
    }
}
