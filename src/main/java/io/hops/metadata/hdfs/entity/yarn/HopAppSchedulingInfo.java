

package io.hops.metadata.hdfs.entity.yarn;

public class HopAppSchedulingInfo {
    private final String schedulerappId;
    private final String appId;
    private final String queuename;
    private final String user;
    private final int containeridcounter;
    private final boolean pending;
    private final boolean stoped;

    public HopAppSchedulingInfo(String schedulerappId, String appId, String queuename, 
            String user, int containeridcounter, boolean pending, boolean stoped) {
        this.schedulerappId = schedulerappId;
        this.appId = appId;
        this.queuename = queuename;
        this.user = user;
        this.containeridcounter = containeridcounter;
        this.pending = pending;
        this.stoped = stoped;
    }

    public HopAppSchedulingInfo(String schedulerappId) {
        this.schedulerappId = schedulerappId;
        this.appId = null;
        this.queuename = null;
        this.user = null;
        this.containeridcounter = 0;
        this.pending = false;
        this.stoped = true;
    }
    
    public String getSchedulerAppId() {
        return schedulerappId;
    }

    public String getAppId() {
        return appId;
    }

    public String getQueuename() {
        return queuename;
    }

    public String getUser() {
        return user;
    }

    public int getContaineridcounter() {
        return containeridcounter;
    }

    public boolean isPending() {
        return pending;
    }

    public boolean isStoped() {
        return stoped;
    }
}
