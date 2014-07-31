package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface FinishedApplicationsTableDef {

    public static final String TABLE_NAME = "ha_rmnode_finishedapplications";
    public static final String HOSTNAME = "hostname";
    public static final String COMMANDPORT = "commandport";
    public static final String APPLICATIONID = "applicationid";
}
