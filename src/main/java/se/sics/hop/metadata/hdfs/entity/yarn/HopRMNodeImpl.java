package se.sics.hop.metadata.hdfs.entity.yarn;

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMNodeImpl {

    public static enum Finder implements FinderType<HopRMNodeImpl> {

        ByHostNameHttpPort, ByNodeAddress;
        @Override
        public Class getType() {
            return HopRMNodeImpl.class;
        }
    }

    private final String hostName;
    private final int commandPort;
    private final int httpPort;
    private final String nodeAddress;
    private final String httpAddress;

    public HopRMNodeImpl(String hostName, int commandPort, int httpPort, String nodeAddress, String httpAddress) {
        this.hostName = hostName;
        this.commandPort = commandPort;
        this.httpPort = httpPort;
        this.nodeAddress = nodeAddress;
        this.httpAddress = httpAddress;
    }

    public String getHostName() {
        return hostName;
    }

    public int getCommandPort() {
        return commandPort;
    }

    public int getHttpPort() {
        return httpPort;
    }

    public String getNodeAddress() {
        return nodeAddress;
    }

    public String getHttpAddress() {
        return httpAddress;
    }

}
