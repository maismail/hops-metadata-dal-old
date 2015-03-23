package io.hops.metadata.yarn.entity;

/**
 * Hop object that represents NodeId interface.
 */
public class NodeId {

    private final String id;
    private final String host;
    private final int port;

    public NodeId(String id, String host, int port) {
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
