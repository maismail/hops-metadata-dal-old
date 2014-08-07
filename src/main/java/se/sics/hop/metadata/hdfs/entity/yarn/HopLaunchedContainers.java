package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing launchedContainers Map in FiCaSchedulerNode.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopLaunchedContainers {

    private String ficaSchedulerNodeID;
    private String containerIdID;
    private String rmContainerID;

    public HopLaunchedContainers(String ficaSchedulerNodeID, String containerIdID, String rmContainerID) {
        this.ficaSchedulerNodeID = ficaSchedulerNodeID;
        this.containerIdID = containerIdID;
        this.rmContainerID = rmContainerID;
    }

    public String getFicaSchedulerNodeID() {
        return ficaSchedulerNodeID;
    }

    public String getContainerIdID() {
        return containerIdID;
    }

    public String getRmContainerID() {
        return rmContainerID;
    }
}
