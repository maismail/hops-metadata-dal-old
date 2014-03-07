package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopJustLaunchedContainers {

    private final int containerid;
    private final int containerstatusid;
    private final int rmnodeid;

    public HopJustLaunchedContainers(int containerid, int containerstatusid, int rmnodeid) {
        this.containerid = containerid;
        this.containerstatusid = containerstatusid;
        this.rmnodeid = rmnodeid;
    }

    public int getContainerid() {
        return containerid;
    }

    public int getContainerstatusid() {
        return containerstatusid;
    }

    public int getRmnodeid() {
        return rmnodeid;
    }
}
