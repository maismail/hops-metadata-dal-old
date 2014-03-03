package se.sics.hop.metadata.hdfs.entity.yarn;

import se.sics.hop.exception.StorageException;

/**
 *
 * @author teo
 */
public class YarnVariables {

    private int id;
    private int lastupdatedcontainerinfoid;

    public YarnVariables(int id, int lastupdatedcontainerinfoid) {
        this.id = id;
        this.lastupdatedcontainerinfoid = lastupdatedcontainerinfoid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLastupdatedcontainerinfoid() {
        return lastupdatedcontainerinfoid;
    }

    public void setLastupdatedcontainerinfoid(int lastupdatedcontainerinfoid) {
        this.lastupdatedcontainerinfoid = lastupdatedcontainerinfoid;
    }
}
