package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo to represent NodeId interface.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNodeId {

    private final int id;
    private final String host;
    private final int port;

    public HopNodeId(int id, String host, int port) {
        this.id = id;
        this.host = host;
        this.port = port;
    }

    public int getId() {
        return id;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}
