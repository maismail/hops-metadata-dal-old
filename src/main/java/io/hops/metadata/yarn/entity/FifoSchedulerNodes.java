package io.hops.metadata.yarn.entity;

/**
 * Pojo class for nodes ConcurrentMap in FifoScheduler.
 */
public class FifoSchedulerNodes {

    private final String nodeidID;
    private final String ficaSchedulerNodeID;

    public FifoSchedulerNodes(String nodeidID, String ficaSchedulerNodeID) {
        this.nodeidID = nodeidID;
        this.ficaSchedulerNodeID = ficaSchedulerNodeID;
    }

    public String getNodeidID() {
        return nodeidID;
    }

    public String getFicaSchedulerNodeID() {
        return ficaSchedulerNodeID;
    }

    @Override
    public String toString() {
        return "HopFifoSchedulerNodes{" + "nodeidID=" + nodeidID + ", ficaSchedulerNodeID=" + ficaSchedulerNodeID + '}';
    }
}
