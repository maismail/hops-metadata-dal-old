package se.sics.hop.metadata.hdfs.tabledef;

/**
 * Defines table structure for RMNodeImpl class.
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMNodeImplTableDef {
    public static final String TABLE_NAME = "rmnodeimpl";
    public static final String ID = "id";
    public static final String HOST_NAME = "hostname";
    public static final String COMMAND_PORT = "commandport";
    public static final String HTTP_PORT = "httpport";
    public static final String NODE_ADDRESS = "nodeaddress";
    public static final String HTTP_ADDRESS = "httpaddress";
}
