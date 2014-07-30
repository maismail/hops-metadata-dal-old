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
public class HopFifoSchedulerApps {
    private final int applicationid;
    private final int schedulerapplication_id;

    public HopFifoSchedulerApps(int applicationid, int schedulerapplication_id) {
        this.applicationid = applicationid;
        this.schedulerapplication_id = schedulerapplication_id;
    }

    public int getApplicationid() {
        return applicationid;
    }

    public int getSchedulerapplication_id() {
        return schedulerapplication_id;
    }
}
