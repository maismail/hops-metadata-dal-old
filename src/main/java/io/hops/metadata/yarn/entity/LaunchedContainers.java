package io.hops.metadata.yarn.entity;

/**
 * Pojo representing launchedContainers Map in FiCaSchedulerNode.
 */
public class LaunchedContainers {

    private final String schedulerNodeID;
    private final String containerIdID;
    private final String rmContainerID;

    public LaunchedContainers(String schedulerNodeID, String containerIdID,
        String rmContainerID) {
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
