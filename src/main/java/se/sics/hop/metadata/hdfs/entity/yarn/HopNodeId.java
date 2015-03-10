package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Hop object that represents NodeId interface.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNodeId {

    private final String id;
    private final String host;
    private final int port;

    public HopNodeId(String id, String host, int port) {
        this.id = id;
        this.host = host;
        this.port = port;
    }

    public String getId() {
        return id;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}