package io.hops.metadata.hdfs.entity.yarn;

import java.util.List;
import java.util.Map;

public class HopRMNodeComps {

  private final HopRMNode hopRMNode;
  private final HopNextHeartbeat hopNextHeartbeat;
  private final HopNode hopNode;
  private final HopNodeHBResponse hopNodeHBResponse;
  private final HopResource hopResource;
  private final List<HopJustLaunchedContainers> hopJustLaunchedContainers;
  //hopUpdatedContainerInfo are grouped by updatedContainerInfoId
  private final Map<Integer, List<HopUpdatedContainerInfo>> hopUpdatedContainerInfo;
  private final List<HopContainerId> hopContainerIdsToClean;
  private final List<HopFinishedApplications> hopFinishedApplications;
  private final Map<String, HopContainerStatus> hopContainersStatus;

  public HopRMNodeComps(HopRMNode hopRMNode, HopNextHeartbeat hopNextHeartbeat,
          HopNode hopNode,
          HopNodeHBResponse hopNodeHBResponse, HopResource hopResource,
          List<HopJustLaunchedContainers> hopJustLaunchedContainers,
          Map<Integer, List<HopUpdatedContainerInfo>> hopUpdatedContainerInfo,
          List<HopContainerId> hopContainerIdsToClean,
          List<HopFinishedApplications> hopFinishedApplications,
          Map<String, HopContainerStatus> hopContainersStatus) {
    this.hopRMNode = hopRMNode;
    this.hopNextHeartbeat = hopNextHeartbeat;
    this.hopNode = hopNode;
    this.hopNodeHBResponse = hopNodeHBResponse;
    this.hopResource = hopResource;
    this.hopJustLaunchedContainers = hopJustLaunchedContainers;
    this.hopUpdatedContainerInfo = hopUpdatedContainerInfo;
    this.hopContainerIdsToClean = hopContainerIdsToClean;
    this.hopFinishedApplications = hopFinishedApplications;
    this.hopContainersStatus = hopContainersStatus;
  }

  public HopResource getHopResource() {
    return hopResource;
  }

  public List<HopJustLaunchedContainers> getHopJustLaunchedContainers() {
    return hopJustLaunchedContainers;
  }

  public Map<Integer, List<HopUpdatedContainerInfo>> getHopUpdatedContainerInfo() {
    return hopUpdatedContainerInfo;
  }

  public List<HopContainerId> getHopContainerIdsToClean() {
    return hopContainerIdsToClean;
  }

  public List<HopFinishedApplications> getHopFinishedApplications() {
    return hopFinishedApplications;
  }

  public Map<String, HopContainerStatus> getHopContainersStatus() {
    return hopContainersStatus;
  }

  public HopRMNode getHopRMNode() {
    return hopRMNode;
  }

  public HopNextHeartbeat getHopNextHeartbeat() {
    return hopNextHeartbeat;
  }

  public HopNode getHopNode() {
    return hopNode;
  }

  public HopNodeHBResponse getHopNodeHBResponse() {
    return hopNodeHBResponse;
  }

}
