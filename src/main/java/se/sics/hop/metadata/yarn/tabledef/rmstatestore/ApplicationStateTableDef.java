package se.sics.hop.metadata.yarn.tabledef.rmstatestore;

/**
 *
 * @author nickstanogias
 */
public interface ApplicationStateTableDef {
    public static final String TABLE_NAME = "applicationstate";
    public static final String APPLICATIONID = "applicationid";
    public static final String APPSTATE = "appstate";
    public static final String USER = "appuser";
    public static final String NAME = "appname";
    public static final String SMSTATE = "appsmstate";
}