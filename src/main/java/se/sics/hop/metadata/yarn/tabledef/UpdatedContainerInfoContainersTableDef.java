package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface UpdatedContainerInfoContainersTableDef {

    public static final String TABLE_NAME = "updatedcontainerinfo_containers";
    public static final String CONTAINERSTATUS_ID = "containerstatus_id";
    public static final String UPDATEDCONTAINERINFO_ID = "updatedcontainerinfo_id";
    //At the moment Type is either 0(=NEW), or 1 (=COMPLETED)
    public static final String TYPE = "type";
}
