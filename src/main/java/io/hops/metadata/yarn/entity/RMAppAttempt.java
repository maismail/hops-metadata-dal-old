

package io.hops.metadata.yarn.entity;

public class RMAppAttempt {
    private final int id;
    private final int rmcontextid;
    private final int schedulerid;
    private final int appmasterserviceid;
    private final int appattemptidid;
    private final int appsubmissionctx;
    private final int containerid;
    private final float progress;
    private final String host;
    private final int rpcport;
    private final String origtrackingurl;
    private final String proxiedtrackingurl;
    private final long starttime;
    private final String finalstatus;
    private final String diagnostics;
    private final String user;

    public RMAppAttempt(int id, int rmcontextid, int schedulerid,
        int appmasterserviceid, int appattemptidid, int appsubmissionctx,
        int containerid, float progress, String host, int rpcport,
        String origtrackingurl, String proxiedtrackingurl, long starttime,
        String finalstatus, String diagnostics, String user) {
        this.id = id;
        this.rmcontextid = rmcontextid;
        this.schedulerid = schedulerid;
        this.appmasterserviceid = appmasterserviceid;
        this.appattemptidid = appattemptidid;
        this.appsubmissionctx = appsubmissionctx;
        this.containerid = containerid;
        this.progress = progress;
        this.host = host;
        this.rpcport = rpcport;
        this.origtrackingurl = origtrackingurl;
        this.proxiedtrackingurl = proxiedtrackingurl;
        this.starttime = starttime;
        this.finalstatus = finalstatus;
        this.diagnostics = diagnostics;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public int getRmcontextid() {
        return rmcontextid;
    }

    public int getSchedulerid() {
        return schedulerid;
    }

    public int getAppmasterserviceid() {
        return appmasterserviceid;
    }

    public int getAppattemptidid() {
        return appattemptidid;
    }

    public int getAppsubmissionctx() {
        return appsubmissionctx;
    }

    public int getContainerid() {
        return containerid;
    }

    public float getProgress() {
        return progress;
    }

    public String getHost() {
        return host;
    }

    public int getRpcport() {
        return rpcport;
    }

    public String getOrigtrackingurl() {
        return origtrackingurl;
    }

    public String getProxiedtrackingurl() {
        return proxiedtrackingurl;
    }

    public long getStarttime() {
        return starttime;
    }

    public String getFinalstatus() {
        return finalstatus;
    }

    public String getDiagnostics() {
        return diagnostics;
    }

    public String getUser() {
        return user;
    }
}
