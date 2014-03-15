package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing the inactivenodes Map of RMContext.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContextInactiveNodes {

    private final int rmcontextid;
    private final String host;
    private final int rmnodeId;

    public HopRMContextInactiveNodes(int rmcontextid, String host, int rmnodeId) {
        this.rmcontextid = rmcontextid;
        this.host = host;
        this.rmnodeId = rmnodeId;
    }

    public int getRmcontextid() {
        return rmcontextid;
    }

    public String getHost() {
        return host;
    }

    public int getRmnodeId() {
        return rmnodeId;
    }
}
