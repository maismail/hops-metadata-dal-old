package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface YarnVariablesTableDef {

    public static final String TABLE_NAME = "ha_variables";
    public static final String ID = "id";
    public static final String VALUE = "value";
    
    //Used in previous implementation with single row in table.
    public static final String LAST_UPDATEDCONTAINERINFO_ID = "last_updatedcontainerinfo_id";
    public static final String LAST_NODEID_ID = "last_nodeid_id";
    public static final String LAST_NODE_ID = "last_node_id";
    public static final String LAST_RESOURCE_ID = "last_resource_id";
    public static final String LAST_LIST_ID = "last_list_id";
    public static final String LAST_NODEHBRESPONSE_ID = "last_nodehbresponse_id";
    public static final String LAST_RMCONTEXT_ID = "last_rmcontext_id";
    public static final String LAST_CONTAINERSTATUS_ID = "last_containerstatus_id";
    public static final String LAST_CONTAINERID_ID = "last_containerid_id";
    public static final String LAST_APPATTEMPTID_ID = "last_appattemptid_id";
    public static final String LAST_APPLICATIONID_ID = "last_applicationid_id";
    public static final int idVal = 0;
}
