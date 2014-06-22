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
    private int id;
    private int appschedulinginfo_id;
    private int currentconsumption_id;
    private int resourcelimit_id;
    private boolean isstoped;
    private int rmcontext_id;
    private int currentreservation;

    public HopFiCaSchedulerApp(int id, int appschedulinginfo_id, int currentconsumption_id, int resourcelimit_id, boolean isstoped, int rmcontext_id, int currentreservation) {
        this.id = id;
        this.appschedulinginfo_id = appschedulinginfo_id;
        this.currentconsumption_id = currentconsumption_id;
        this.resourcelimit_id = resourcelimit_id;
        this.isstoped = isstoped;
        this.rmcontext_id = rmcontext_id;
        this.currentreservation = currentreservation;
    }

    public int getId() {
        return id;
    }

    public int getAppschedulinginfo_id() {
        return appschedulinginfo_id;
    }

    public int getCurrentconsumption_id() {
        return currentconsumption_id;
    }

    public int getResourcelimit_id() {
        return resourcelimit_id;
    }

    public boolean isIsstoped() {
        return isstoped;
    }

    public int getRmcontext_id() {
        return rmcontext_id;
    }

    public int getCurrentreservation() {
        return currentreservation;
    }
    
}
