package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo class for nodes ConcurrentMap in FifoScheduler.
 */
public class HopFifoSchedulerNodes {

    private final String nodeidID;
    private final String ficaSchedulerNodeID;

    public HopFifoSchedulerNodes(String nodeidID, String ficaSchedulerNodeID) {
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
