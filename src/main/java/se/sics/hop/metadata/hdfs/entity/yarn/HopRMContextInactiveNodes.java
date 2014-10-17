package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Hop object representing the inactivenodes Map of RMContext.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContextInactiveNodes {

    private final String rmnodeid;

    public HopRMContextInactiveNodes(String rmnodeid) {
        this.rmnodeid = rmnodeid;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

}
