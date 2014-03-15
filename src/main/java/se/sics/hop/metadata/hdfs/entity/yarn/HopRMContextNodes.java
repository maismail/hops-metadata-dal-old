package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing the nodes Map of RMContext.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContextNodes {

    private final int rmcontextid;
    private final int nodeidId;
    private final int rmnodeId;

    public HopRMContextNodes(int rmcontextid, int nodeidId, int rmnodeId) {
        this.rmcontextid = rmcontextid;
        this.nodeidId = nodeidId;
        this.rmnodeId = rmnodeId;
    }

    public int getRmcontextid() {
        return rmcontextid;
    }

    public int getNodeidId() {
        return nodeidId;
    }

    public int getRmnodeId() {
        return rmnodeId;
    }
}
