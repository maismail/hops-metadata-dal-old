/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author nickstanogias
 */
public class HopFiCaSchedulerApp {
    private final String appattemptid;
    private final int currentreservation_id;
    private final int resourcelimit_id;
    private final int currentconsumption_id;
    private final boolean isstoped;
    private final int rmcontext_id;

    public HopFiCaSchedulerApp(String appattemptid, int currentreservation_id, int resourcelimit_id, int currentconsumption_id, boolean isstoped, int rmcontext_id) {
        this.appattemptid = appattemptid;
        this.currentreservation_id = currentreservation_id;
        this.resourcelimit_id = resourcelimit_id;
        this.currentconsumption_id = currentconsumption_id;
        this.isstoped = isstoped;
        this.rmcontext_id = rmcontext_id;
    }

    public String getAppattemptid() {
        return appattemptid;
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

    public int getRmcontext_id() {
        return rmcontext_id;
    }
}
