package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopJustLaunchedContainers {

    private final String rmnodeid;
    private final String containerid;
    private final String containerstatusid;

    public HopJustLaunchedContainers(String rmnodeid, String containerid, String containerstatusid) {
        this.rmnodeid = rmnodeid;
        this.containerid = containerid;
        this.containerstatusid = containerstatusid;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

    public String getContainerid() {
        return containerid;
    }

    public String getContainerstatusid() {
        return containerstatusid;
    }
}
