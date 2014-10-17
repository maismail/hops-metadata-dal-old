package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopJustLaunchedContainers {

    private final String rmnodeid;
    private final String containerid;

    public HopJustLaunchedContainers(String rmnodeid, String containerid) {
        this.rmnodeid = rmnodeid;
        this.containerid = containerid;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

    public String getContainerId() {
        return containerid;
    }

}
