package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopUpdatedContainerInfo {

    private final String rmnodeid;
    private final int id;

    public HopUpdatedContainerInfo(String rmnodeid, int id) {
        this.rmnodeid = rmnodeid;
        this.id = id;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

    public int getId() {
        return id;
    }
}
