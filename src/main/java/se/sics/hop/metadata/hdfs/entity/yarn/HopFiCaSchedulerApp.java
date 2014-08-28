package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author nickstanogias
 */
public class HopFiCaSchedulerApp {

    private final String ficaAppId;
    private final int appId;
    private final boolean isstoped;

    public HopFiCaSchedulerApp(String ficaAppId, int appId, boolean isstoped) {
        this.ficaAppId = ficaAppId;
        this.appId = appId;
        this.isstoped = isstoped;
    }

    public String getFicaAppId() {
        return ficaAppId;
    }

    public int getAppId() {
        return appId;
    }

    public boolean isIsstoped() {
        return isstoped;
    }
}
