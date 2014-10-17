package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Hop object representing the inactivenodes Map of RMContext.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMContextInactiveNodes {

    private final String rmnodeid;
    private final String host; //TORECOVER remove, useless

    public HopRMContextInactiveNodes(String host, String rmnodeid) {
        this.rmnodeid = rmnodeid;
        this.host = host;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

    public String getHost() {
        return host;
    }
}
