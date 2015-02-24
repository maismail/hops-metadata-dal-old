package se.sics.hop.metadata.yarn.tabledef;

/**
 * Table definition of ha_invokerequests table.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface InvokeRequestTableDef {

    public static final String TABLE_NAME = "ha_invokerequests";
    public static final String NODEID = "nodeid";
    public static final String TYPE = "type";
    public static final String STATUS = "status";
    
    //STATUS CODES of requests
    public static final int STATUS_NEW = 0;
    public static final int STATUS_PENDING = 1;
}
