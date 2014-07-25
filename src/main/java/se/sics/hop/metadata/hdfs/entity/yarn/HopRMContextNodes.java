package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing the nodes Map of RMContext.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContextNodes {

    private final int nodeidId;
    private final int rmnodeId;

    public HopRMContextNodes(int nodeidId, int rmnodeId) {
        this.nodeidId = nodeidId;
        this.rmnodeId = rmnodeId;
    }

    public int getNodeidId() {
        return nodeidId;
    }

    public int getRmnodeId() {
        return rmnodeId;
    }
}
