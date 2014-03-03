package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopUpdatedContainerInfo {

    private final int id;
    private final int rmnodeid;

    public HopUpdatedContainerInfo(int id, int rmnodeid) {
        this.id = id;
        this.rmnodeid = rmnodeid;
    }

    public int getId() {
        return id;
    }

    public int getRmnodeid() {
        return rmnodeid;
    }
}
