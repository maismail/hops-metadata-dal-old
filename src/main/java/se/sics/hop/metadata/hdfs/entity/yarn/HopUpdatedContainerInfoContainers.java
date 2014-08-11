package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Represents a list of containerstatus object in the
 * RMNode.UpdatedContainerInfo object.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopUpdatedContainerInfoContainers {

    private String containerstatusId;
    private int updatedcontainerinfoId;
    //Type is zero(0:NEWLYLAUNCHED), one (1:COMPLETED)
    private int type;

    public HopUpdatedContainerInfoContainers(String containerstatusId, int updatedcontainerinfoId, int type) {
        this.containerstatusId = containerstatusId;
        this.updatedcontainerinfoId = updatedcontainerinfoId;
        this.type = type;
    }

    public String getContainerstatusId() {
        return containerstatusId;
    }

    public int getUpdatedcontainerinfoId() {
        return updatedcontainerinfoId;
    }

    public int getType() {
        return type;
    }
}
