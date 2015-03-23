

package io.hops.metadata.yarn.entity;

public class HopRMApp {
    private final int id;
    private final int applicationidid;
    private final int rmcontextid;
    private final String user;
    private final String name;
    private final int appsubmissionctxid;
    private final int schedulerid;
    private final int appmasterserviceid;
    private final String diagnostics;
    private final int maxappattempts;
    private final long submittime;
    private final String applicationtype;
    private final long starttime;
    private final long finishtime;
    private final int currentattemptid;
    private final boolean isappremovalrequestsent;

    public HopRMApp(int id, int applicationidid, int rmcontextid, String user, String name, int appsubmissionctxid, int schedulerid, int appmasterserviceid, String diagnostics, int maxappattempts, long submittime, String applicationtype, long starttime, long finishtime, int currentattemptid, boolean isappremovalrequestsent) {
        this.id = id;
        this.applicationidid = applicationidid;
        this.rmcontextid = rmcontextid;
        this.user = user;
        this.name = name;
        this.appsubmissionctxid = appsubmissionctxid;
        this.schedulerid = schedulerid;
        this.appmasterserviceid = appmasterserviceid;
        this.diagnostics = diagnostics;
        this.maxappattempts = maxappattempts;
        this.submittime = submittime;
        this.applicationtype = applicationtype;
        this.starttime = starttime;
        this.finishtime = finishtime;
        this.currentattemptid = currentattemptid;
        this.isappremovalrequestsent = isappremovalrequestsent;
    }

    public int getId() {
        return id;
    }

    public int getApplicationidid() {
        return applicationidid;
    }

    public int getRmcontextid() {
        return rmcontextid;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public int getAppsubmissionctxid() {
        return appsubmissionctxid;
    }

    public int getSchedulerid() {
        return schedulerid;
    }

    public int getAppmasterserviceid() {
        return appmasterserviceid;
    }

    public String getDiagnostics() {
        return diagnostics;
    }

    public int getMaxappattempts() {
        return maxappattempts;
    }

    public long getSubmittime() {
        return submittime;
    }

    public String getApplicationtype() {
        return applicationtype;
    }

    public long getStarttime() {
        return starttime;
    }

    public long getFinishtime() {
        return finishtime;
    }

    public int getCurrentattemptid() {
        return currentattemptid;
    }

    public boolean isIsappremovalrequestsent() {
        return isappremovalrequestsent;
    }
    
    
}
