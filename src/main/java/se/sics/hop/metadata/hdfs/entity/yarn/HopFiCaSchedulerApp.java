package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author nickstanogias
 */
public class HopFiCaSchedulerApp {

    private final String schedulerAppId;
    private final int appId;
    private final boolean isstoped;

    public HopFiCaSchedulerApp(String schedulerAppId, int appId, boolean isstoped) {
        this.schedulerAppId = schedulerAppId;
        this.appId = appId;
        this.isstoped = isstoped;
    }

    public String getSchedulerAppId() {
        return schedulerAppId;
    }

    public int getAppId() {
        return appId;
    }

    public boolean isIsstoped() {
        return isstoped;
    }
}
