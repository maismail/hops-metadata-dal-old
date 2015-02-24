package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNode {

    private final String id;
    private final String name;
    private final String location;
    private final int level;
    private final String parent;

    public HopNode(String id, String name, String location, int level, String parent) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.level = level;
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getLevel() {
        return level;
    }

    public String getParent() {
        return parent;
    }
}
