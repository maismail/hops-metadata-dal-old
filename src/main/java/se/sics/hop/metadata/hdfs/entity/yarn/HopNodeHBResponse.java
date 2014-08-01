package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNodeHBResponse {

    private final String hostname;
    private final int commandport;
    private final byte[] responseid;

    public HopNodeHBResponse(String hostname, int commandport, byte[] responseid) {
        this.hostname = hostname;
        this.commandport = commandport;
        this.responseid = responseid;
    }

    public String getHostname() {
        return hostname;
    }

    public int getCommandport() {
        return commandport;
    }

    public byte[] getResponseid() {
        return responseid;
    }
}
