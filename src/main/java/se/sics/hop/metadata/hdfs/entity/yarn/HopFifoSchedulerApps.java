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
    private final String applicationid;
    private final String schedulerapplication_id;

    public HopFifoSchedulerApps(String applicationid, String schedulerapplication_id) {
        this.applicationid = applicationid;
        this.schedulerapplication_id = schedulerapplication_id;
    }

    public String getApplicationid() {
        return applicationid;
    }

    public String getSchedulerapplication_id() {
        return schedulerapplication_id;
    }
}
