package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ApplicationIdTableDef {
    public static final String TABLE_NAME = "hayarn_applicationid";
    public static final String ID = "id";
    public static final String CLUSTER_TIMESTAMP = "clustertimestamp";
    public static final String FINISHED = "finished";
}
