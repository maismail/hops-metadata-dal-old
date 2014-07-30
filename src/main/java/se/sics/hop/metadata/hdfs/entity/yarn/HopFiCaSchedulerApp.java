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
    private final int id;
    private final int appschedulinginfo_id;
    private final int currentreservation_id;
    private final int resourcelimit_id;
    private final int currentconsumption_id;
    private final boolean isstoped;
    private final int rmcontext_id;

    public HopFiCaSchedulerApp(int id, int appschedulinginfo_id, int currentreservation_id, int resourcelimit_id, int currentconsumption_id, boolean isstoped, int rmcontext_id) {
        this.id = id;
        this.appschedulinginfo_id = appschedulinginfo_id;
        this.currentreservation_id = currentreservation_id;
        this.resourcelimit_id = resourcelimit_id;
        this.currentconsumption_id = currentconsumption_id;
        this.isstoped = isstoped;
        this.rmcontext_id = rmcontext_id;
    }

    public int getId() {
        return id;
    }

    public int getAppschedulinginfo_id() {
        return appschedulinginfo_id;
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
