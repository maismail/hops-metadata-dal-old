package se.sics.hop.metadata.hdfs.entity.yarn;

public class HopResource {

    /**
     * Used in resource primary key, to know by which class the particular
     * resource is used.
     */
    public static final int FICASCHEDULERNODE = 1;
    public static final int RMNODE = 2;
    public static final int SCHEDULERAPPLICATIONATTEMPT = 3;
    public static final int CLUSTER = 4;
    /**
     * Resource types, useful when an entity has more than one resources.
     */
    public static final int TOTAL_CAPABILITY = 1;
    public static final int USED = 2;
    public static final int AVAILABLE = 3;
    public static final int CURRENTRESERVATION = 4;
    public static final int RESOURCELIMIT = 5;
    public static final int CURRENTCONSUMPTION = 6;
    
    private String id;
    private int type;
    private int parent;
    private int memory;
    private int virtualcores;

    public HopResource(String id, int type, int parent){
         this.id = id;
        this.type = type;
        this.parent = parent;
    }
    
    public HopResource(String id, int type, int parent, int memory, int virtualcores) {
        this.id = id;
        this.type = type;
        this.parent = parent;
        this.memory = memory;
        this.virtualcores = virtualcores;
    }

    public String getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public int getParent() {
        return parent;
    }

    public int getMemory() {
        return memory;
    }

    public int getVirtualCores() {
        return virtualcores;
    }
}
