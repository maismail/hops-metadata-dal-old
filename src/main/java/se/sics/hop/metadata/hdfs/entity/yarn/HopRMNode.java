package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopRMNode {

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
    private final long lastHealthReportTime;
    private final String currentState;
    private final String nodemanagerVersion;
    private final int overcommittimeout;

    public HopRMNode(int nodeId, String hostName, int commandPort, int httpPort, String nodeAddress, String httpAddress, boolean nextHeartbeat, int resourceId, int nodebaseId, String healthReport, long lastHealthReportTime, String currentState, String nodemanagerVersion, int overcommittimeout) {
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
        this.lastHealthReportTime = lastHealthReportTime;
        this.currentState = currentState;
        this.nodemanagerVersion = nodemanagerVersion;
        this.overcommittimeout = overcommittimeout;
    }

    public String getNodemanagerVersion() {
        return nodemanagerVersion;
    }

    public int getOvercommittimeout() {
        return overcommittimeout;
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

    public long getLastHealthReportTime() {
        return lastHealthReportTime;
    }

    public String getCurrentState() {
        return currentState;
    }
}
