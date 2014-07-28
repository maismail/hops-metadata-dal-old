package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerIdToClean {

    private int rmnodeId;
    private int containeridId;

    public HopContainerIdToClean(int rmnodeId, int containeridId) {
        this.rmnodeId = rmnodeId;
        this.containeridId = containeridId;
    }

    public int getRmnodeId() {
        return rmnodeId;
    }

    public int getContaineridId() {
        return containeridId;
    }
}
