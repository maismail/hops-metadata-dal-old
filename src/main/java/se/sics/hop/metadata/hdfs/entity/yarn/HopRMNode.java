package se.sics.hop.metadata.hdfs.entity.yarn;

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMNode {

    public static enum Finder implements FinderType<HopRMNode> {

        ByNodeId, ByHostNameHttpPort, ByNodeAddress;

        @Override
        public Class getType() {
            return HopRMNode.class;
        }
    }
    
    private final int nodeId;
    private final String hostName;
    private final int commandPort;
    private final int httpPort;
    private final String nodeAddress;
    private final String httpAddress;
    private final boolean nextHeartbeat;
    private final int resourceId;
    private final int nodebaseId;
    private final String healthReport;
    private final int rmcontextId;
    private final long lastHealthReportTime;

    public HopRMNode(int nodeId, String hostName, int commandPort, int httpPort, String nodeAddress, String httpAddress, boolean nextHeartbeat, int resourceId, int nodebaseId, String healthReport, int rmcontextId, long lastHealthReportTime) {
        this.nodeId = nodeId;
        this.hostName = hostName;
        this.commandPort = commandPort;
        this.httpPort = httpPort;
        this.nodeAddress = nodeAddress;
        this.httpAddress = httpAddress;
        this.nextHeartbeat = nextHeartbeat;
        this.resourceId = resourceId;
        this.nodebaseId = nodebaseId;
        this.healthReport = healthReport;
        this.rmcontextId = rmcontextId;
        this.lastHealthReportTime = lastHealthReportTime;
    }

    public int getNodeId() {
        return nodeId;
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

    public boolean isNextHeartbeat() {
        return nextHeartbeat;
    }

    public int getResourceId() {
        return resourceId;
    }

    public int getNodebaseId() {
        return nodebaseId;
    }

    public String getHealthReport() {
        return healthReport;
    }

    public int getRmcontextId() {
        return rmcontextId;
    }

    public long getLastHealthReportTime() {
        return lastHealthReportTime;
    }
}
