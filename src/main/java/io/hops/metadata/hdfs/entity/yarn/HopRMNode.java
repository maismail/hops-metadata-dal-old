package io.hops.metadata.hdfs.entity.yarn;

public class HopRMNode implements Comparable<HopRMNode> {

  private final String nodeId;
  private final String hostName;
  private final int commandPort;
  private final int httpPort;
  private final String nodeAddress;
  private final String httpAddress;
  private final String healthReport;
  private final long lastHealthReportTime;
  private final String currentState;
  private final String nodemanagerVersion;
  private final int overcommittimeout;
  private final int uciId;

  public HopRMNode(String nodeId) {
    this.nodeId = nodeId;
    this.hostName = null;
    this.commandPort = -1;
    this.httpPort = -1;
    this.nodeAddress = null;
    this.httpAddress = null;
    this.healthReport = null;
    this.lastHealthReportTime = -1;
    this.currentState = null;
    this.nodemanagerVersion = null;
    this.overcommittimeout = -1;
    this.uciId = -1;
  }

  public HopRMNode(String nodeId, String hostName, int commandPort, int httpPort,
          String nodeAddress, String httpAddress, String healthReport,
          long lastHealthReportTime, String currentState,
          String nodemanagerVersion, int overcommittimeout, int uciId) {
    this.nodeId = nodeId;
    this.hostName = hostName;
    this.commandPort = commandPort;
    this.httpPort = httpPort;
    this.nodeAddress = nodeAddress;
    this.httpAddress = httpAddress;
    this.healthReport = healthReport;
    this.lastHealthReportTime = lastHealthReportTime;
    this.currentState = currentState;
    this.nodemanagerVersion = nodemanagerVersion;
    this.overcommittimeout = overcommittimeout;
    this.uciId = uciId;
  }

  public String getNodemanagerVersion() {
    return nodemanagerVersion;
  }

  public int getOvercommittimeout() {
    return overcommittimeout;
  }

  public String getNodeId() {
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

  public String getHealthReport() {
    return healthReport;
  }

  public long getLastHealthReportTime() {
    return lastHealthReportTime;
  }

  public String getCurrentState() {
    return currentState;
  }

  public int getUciId() {
    return uciId;
  }

  @Override
  public int compareTo(HopRMNode o) {
    if (o == null) {
      throw new NullPointerException("HOP :: HopRMNode was null");
    }
    if (this.nodeId.equals(o.getNodeId())) {
      return 0;
    } else {
      return -1;
    }
  }

  @Override
  public String toString() {
    return "HopRMNode{" + "nodeId=" + nodeId + '}';
  }

}
