package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopResource {

    private int id;
    private int memory;
    private int virtualcores;

    public HopResource(int id, int memory, int virtualcores) {
        this.id = id;
        this.memory = memory;
        this.virtualcores = virtualcores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getVirtualcores() {
        return virtualcores;
    }

    public void setVirtualcores(int virtualcores) {
        this.virtualcores = virtualcores;
    }
}
