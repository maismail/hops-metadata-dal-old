package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMContainerTableDef {
    public static final String TABLE_NAME = "ha_rmcontainer";
    public static final String ID = "id";
    public static final String CONTAINERID_ID = "containerid_id";
    public static final String APPLICATIONATTEMPTID_ID = "appattemptid_id";
    public static final String NODEID_ID = "nodeid_id";
    public static final String CONTAINER_ID = "container_id";
    public static final String RESERVED_RESOURCE_ID = "reservedresource_id";
    public static final String RESERVED_NODEID_ID = "reservednodeid_id";
    public static final String RESERVED_PRIORITY_ID = "reservedpriority_id";
    public static final String STATE = "state";
    public static final String NEWLY_ALLOCATED = "newlyallocated";
}
