package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Hop object representing the nodes Map of RMContext.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContextNodes {

    private final String nodeidId;
    private final String rmnodeId;

    public HopRMContextNodes(String nodeidId, String rmnodeId) {
        this.nodeidId = nodeidId;
        this.rmnodeId = rmnodeId;
    }

    public String getNodeidId() {
        return nodeidId;
    }

    public String getRmnodeId() {
        return rmnodeId;
    }
}
