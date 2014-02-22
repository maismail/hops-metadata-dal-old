package se.sics.hop.metadata.hdfs.entity.yarn;

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 * Pojo to represent NodeId interface.
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNodeId {

    public static enum Finder implements FinderType<HopNodeId> {

        ByNodeId, ByHostPort;

        @Override
        public Class getType() {
            return HopNodeId.class;
        }
    }
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
