

package se.sics.hop.metadata.yarn.tabledef;

public interface RMAppAttemptTableDef {
    public static final String TABLE_NAME = "ha_rmappattempt";
    public static final String ID = "id";
    public static final String RMCONTEXT_ID = "rmcontext_id";
    public static final String SCHEDULER_ID = "scheduler_id";
    public static final String APPMASTERSERVICE_ID = "appmasterservice_id";
    public static final String APPATTEMPTID_ID = "appattemptid_id";
    public static final String APPSUBMISSIONCTX = "appsubmissionctx";
    public static final String CONTAINER_ID = "container_id";
    public static final String PROGRESS = "progress";
    public static final String HOST = "host";
    public static final String RPCPORT = "rpcport";
    public static final String ORIGTRACKINGURL = "origtrackingurl";
    public static final String PROXIEDTRACKINGURL = "proxiedtrackingurl";
    public static final String STARTTIME = "starttime";
    public static final String FINALSTATUS = "finalstatus";
    public static final String DIAGNOSTICS = "diagnostics";
    public static final String USER = "user";
}
