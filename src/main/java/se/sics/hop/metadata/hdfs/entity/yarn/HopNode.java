package se.sics.hop.metadata.hdfs.entity.yarn;

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopNode {

    public static enum Finder implements FinderType<HopNodeId> {

        ById;

        @Override
        public Class getType() {
            return HopNode.class;
        }
    }
    private final int id;
    private final String name;
    private final String location;
    private final int level;
    private final int parent;

    public HopNode(int id, String name, String location, int level, int parent) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.level = level;
        this.parent = parent;
    }

    public int getId() {
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

    public int getParent() {
        return parent;
    }
}
