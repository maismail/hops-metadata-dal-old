package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerStatusTableDef {

    public static final String TABLE_NAME = "ha_containerstatus";
    public static final String CONTAINERID = "containerid";
    public static final String STATE = "state";
    public static final String DIAGNOSTICS = "diagnostics";
    public static final String EXIT_STATUS = "exitstatus";
    
    //State values
    public static final String STATE_NEW = "NEW";
    public static final String STATE_COMPLETED = "COMPLETED";
}
