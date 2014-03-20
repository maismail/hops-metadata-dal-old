package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing launchedContainers Map in FiCaSchedulerNode.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopLaunchedContainers {

    private int ficaSchedulerNodeID;
    private int containerIdID;
    private int rmContainerID;

    public HopLaunchedContainers(int ficaSchedulerNodeID, int containerIdID, int rmContainerID) {
        this.ficaSchedulerNodeID = ficaSchedulerNodeID;
        this.containerIdID = containerIdID;
        this.rmContainerID = rmContainerID;
    }

    public int getFicaSchedulerNodeID() {
        return ficaSchedulerNodeID;
    }

    public int getContainerIdID() {
        return containerIdID;
    }

    public int getRmContainerID() {
        return rmContainerID;
    }
}
