package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerStatusTableDef {

    public static final String TABLE_NAME = "hayarn_containerstatus";
    public static final String ID = "id";
    public static final String STATE = "state";
    public static final String CONTAINER_ID = "containerid";
    public static final String DIAGNOSTICS = "diagnostics";
    public static final String EXIT_STATUS = "exitstatus";
    public static final String TYPE = "type";
    public static final String UPDATEDCONTAINERINFO_ID = "updatedcontainerinfoid";
}
