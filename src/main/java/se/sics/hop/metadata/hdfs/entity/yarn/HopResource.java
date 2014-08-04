package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopResource {

    private String id;
    private int type;
    private int memory;
    private int virtualcores;

    public HopResource(String id, int type, int memory, int virtualcores) {
        this.id = id;
        this.type = type;
        this.memory = memory;
        this.virtualcores = virtualcores;
    }

    public String getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public int getMemory() {
        return memory;
    }

    public int getVirtualcores() {
        return virtualcores;
    }
}
