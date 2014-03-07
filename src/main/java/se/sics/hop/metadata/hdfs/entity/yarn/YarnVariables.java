package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class YarnVariables {

    private int id;
    private int lastupdatedcontainerinfoid;
    private int lastnodeidId;
    private int lastnodeId;
    private int lastresourceId;
    private int lastlistid;

    public YarnVariables(int id, int lastupdatedcontainerinfoid, int lastnodeidId, int lastnodeId, int lastresourceId, int lastlistid) {
        this.id = id;
        this.lastupdatedcontainerinfoid = lastupdatedcontainerinfoid;
        this.lastnodeidId = lastnodeidId;
        this.lastnodeId = lastnodeId;
        this.lastresourceId = lastresourceId;
        this.lastlistid = lastlistid;
    }

    public int getId() {
        return id;
    }

    public int getLastupdatedcontainerinfoid() {
        return lastupdatedcontainerinfoid;
    }

    public int getLastnodeidId() {
        return lastnodeidId;
    }

    public int getLastnodeId() {
        return lastnodeId;
    }

    public int getLastresourceId() {
        return lastresourceId;
    }

    public int getLastlistid() {
        return lastlistid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastupdatedcontainerinfoid(int lastupdatedcontainerinfoid) {
        this.lastupdatedcontainerinfoid = lastupdatedcontainerinfoid;
    }

    public void setLastnodeidId(int lastnodeidId) {
        this.lastnodeidId = lastnodeidId;
    }

    public void setLastnodeId(int lastnodeId) {
        this.lastnodeId = lastnodeId;
    }

    public void setLastresourceId(int lastresourceId) {
        this.lastresourceId = lastresourceId;
    }

    public void setLastlistid(int lastlistid) {
        this.lastlistid = lastlistid;
    }
}
