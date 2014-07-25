package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Represents a list of containerstatus object in the
 * RMNode.UpdatedContainerInfo object.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopUpdatedContainerInfoContainers {

    private int containerstatusId;
    private int updatedcontainerinfoId;
    //Type is zero(0:NEWLYLAUNCHED), one (1:COMPLETED)
    private int type;

    public HopUpdatedContainerInfoContainers(int containerstatusId, int updatedcontainerinfoId, int type) {
        this.containerstatusId = containerstatusId;
        this.updatedcontainerinfoId = updatedcontainerinfoId;
        this.type = type;
    }

    public int getContainerstatusId() {
        return containerstatusId;
    }

    public int getUpdatedcontainerinfoId() {
        return updatedcontainerinfoId;
    }

    public int getType() {
        return type;
    }
}
