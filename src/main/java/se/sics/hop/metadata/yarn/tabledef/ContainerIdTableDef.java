package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerIdTableDef {

    public static final String TABLE_NAME = "hayarn_containerid";
    public static final String ID = "id";
    public static final String APPLICATIONATTEMPT_ID = "applicationattemptid";
    /**
     * Denotes if a containerId is in the RMNode containersToClean set.
     */
    public static final String TO_CLEAN = "toclean";
}
