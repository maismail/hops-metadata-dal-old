package io.hops.metadata.yarn.entity;

/**
 * Pojo representing launchedContainers Map in FiCaSchedulerNode.
 */
public class HopLaunchedContainers {

    private final String schedulerNodeID;
    private final String containerIdID;
    private final String rmContainerID;

    public HopLaunchedContainers(String schedulerNodeID, String containerIdID, String rmContainerID) {
        this.schedulerNodeID = schedulerNodeID;
        this.containerIdID = containerIdID;
        this.rmContainerID = rmContainerID;
    }
        
    public String getSchedulerNodeID() {
        return schedulerNodeID;
    }

    public String getContainerIdID() {
        return containerIdID;
    }

    public String getRmContainerID() {
        return rmContainerID;
    }   
}
