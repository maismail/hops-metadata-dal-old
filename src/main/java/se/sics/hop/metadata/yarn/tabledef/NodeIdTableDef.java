package se.sics.hop.metadata.yarn.tabledef;

/**
 * Defines table structure for NodeIDPBImpl class.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface NodeIdTableDef {

    public static final String TABLE_NAME = "hayarn_nodeid";
    public static final String ID = "id";
    public static final String HOST = "host";
    public static final String PORT = "port";
}
