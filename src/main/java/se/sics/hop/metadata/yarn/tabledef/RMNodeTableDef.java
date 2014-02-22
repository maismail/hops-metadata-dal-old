package se.sics.hop.metadata.yarn.tabledef;

/**
 * Defines table structure for RMNodeImpl class.
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMNodeTableDef {
    public static final String TABLE_NAME = "hayarn_rmnode";
    public static final String NODEID = "nodeid";
    public static final String HOST_NAME = "hostname";
    public static final String COMMAND_PORT = "commandport";
    public static final String HTTP_PORT = "httpport";
    public static final String NODE_ADDRESS = "nodeaddress";
    public static final String HTTP_ADDRESS = "httpaddress";
    public static final String NEXT_HEARTBEAT = "nextheartbeat";
    public static final String RESOURCE_ID = "resourceid";
    public static final String NODEBASEID = "nodebaseid";
    public static final String HEALTH_REPORT = "nodehealthstatusid";
    public static final String RMCONTEXT_ID = "rmcontextid";
    public static final String LAST_HEALTH_REPORT_TIME = "lasthealthreporttime";
}