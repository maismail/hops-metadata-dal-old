package se.sics.hop.metadata.yarn.tabledef;

/**
 * Defines table structure for hayarn_node table.
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface NodeTableDef {
    public static final String TABLE_NAME = "hayarn_node";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String LOCATION = "location";
    public static final String LEVEL = "level";
    public static final String PARENT = "parent";
}
