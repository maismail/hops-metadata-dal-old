package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface LaunchedContainersTableDef {

    public static final String TABLE_NAME = "ha_launchedcontainers";
    public static final String SCHEDULERNODE_ID = "schedulernode_id";
    public static final String CONTAINERID_ID = "containerid_id";
    public static final String RMCONTAINER_ID = "rmcontainer_id";
}
