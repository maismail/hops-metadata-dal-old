package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo class for nodes ConcurrentMap in FifoScheduler.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopFifoSchedulerNodes {

    private int fifoSchedulerID;
    private int nodeidID;
    private int ficaSchedulerNodeID;

    public HopFifoSchedulerNodes(int fifoSchedulerID, int nodeidID, int ficaSchedulerNodeID) {
        this.fifoSchedulerID = fifoSchedulerID;
        this.nodeidID = nodeidID;
        this.ficaSchedulerNodeID = ficaSchedulerNodeID;
    }

    public int getFifoSchedulerID() {
        return fifoSchedulerID;
    }

    public int getNodeidID() {
        return nodeidID;
    }

    public int getFicaSchedulerNodeID() {
        return ficaSchedulerNodeID;
    }

    @Override
    public String toString() {
        return "HopFifoSchedulerNodes{" + "fifoSchedulerID=" + fifoSchedulerID + ", nodeidID=" + nodeidID + ", ficaSchedulerNodeID=" + ficaSchedulerNodeID + '}';
    }
    
    
}
