package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Hop object representing the nodes Map of RMContext.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContextActiveNodes {

    private final String nodeidId;

    public HopRMContextActiveNodes(String nodeidId) {
        this.nodeidId = nodeidId;
    }

    public String getNodeidId() {
        return nodeidId;
    }
}
