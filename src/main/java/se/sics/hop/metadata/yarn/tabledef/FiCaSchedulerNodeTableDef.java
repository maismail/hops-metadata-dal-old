package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface FiCaSchedulerNodeTableDef {

    public static final String TABLE_NAME = "ha_ficascheduler_node";
    public static final String ID = "id";
    public static final String AVAILABLE_RESOURCE_ID = "availableresource_id";
    public static final String USER_RESOURCE_ID = "usedresource_id";
    public static final String TOTAL_CAPABILITY_ID = "totalcapability_id";
    public static final String NUMCONTAINERS = "numcontainers";
    public static final String RMNODE_ID = "rmnode_id";
}
