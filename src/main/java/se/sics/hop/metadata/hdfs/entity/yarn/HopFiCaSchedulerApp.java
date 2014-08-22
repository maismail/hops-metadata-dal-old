package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author nickstanogias
 */
public class HopFiCaSchedulerApp {

    private final int appId;
    private final int attemptId;
    private final int currentreservation_id;
    private final int resourcelimit_id;
    private final int currentconsumption_id;
    private final boolean isstoped;

    public HopFiCaSchedulerApp(int appId, int attemptId, int currentreservation_id, int resourcelimit_id, int currentconsumption_id, boolean isstoped) {
        this.appId = appId;
        this.attemptId = attemptId;
        this.currentreservation_id = currentreservation_id;
        this.resourcelimit_id = resourcelimit_id;
        this.currentconsumption_id = currentconsumption_id;
        this.isstoped = isstoped;

    }

    public int getAppId() {
        return appId;
    }

    public int getAttemptId(){
      return attemptId;
    }
    
    public int getCurrentreservation_id() {
        return currentreservation_id;
    }

    public int getResourcelimit_id() {
        return resourcelimit_id;
    }

    public int getCurrentconsumption_id() {
        return currentconsumption_id;
    }

    public boolean isIsstoped() {
        return isstoped;
    }
}
