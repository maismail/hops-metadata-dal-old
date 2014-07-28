package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo class for nodes ConcurrentMap in FifoScheduler.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopFifoSchedulerNodes {

    private final int nodeidID;
    private final int ficaSchedulerNodeID;

    public HopFifoSchedulerNodes(int nodeidID, int ficaSchedulerNodeID) {
        this.nodeidID = nodeidID;
        this.ficaSchedulerNodeID = ficaSchedulerNodeID;
    }

    public int getNodeidID() {
        return nodeidID;
    }

    public int getFicaSchedulerNodeID() {
        return ficaSchedulerNodeID;
    }

    @Override
    public String toString() {
        return "HopFifoSchedulerNodes{" + "nodeidID=" + nodeidID + ", ficaSchedulerNodeID=" + ficaSchedulerNodeID + '}';
    }   
}
