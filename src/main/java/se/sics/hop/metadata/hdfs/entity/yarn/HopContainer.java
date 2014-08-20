package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainer {

    private String containerIdID;
    private byte[] containerstate;

    public HopContainer(String containerIdID, byte[] containerstate) {
        this.containerIdID = containerIdID;
        this.containerstate = containerstate;
    }

    public String getContainerIdID() {
        return containerIdID;
    }

    public byte[] getContainerstate() {
        return containerstate;
    }
}
