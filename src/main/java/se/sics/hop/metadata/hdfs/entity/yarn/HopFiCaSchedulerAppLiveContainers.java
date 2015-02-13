/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 */
public class HopFiCaSchedulerAppLiveContainers {
    private final String schedulerapp_id;
    private final String containerid_id;
    private final String rmcontainer_id;

    public HopFiCaSchedulerAppLiveContainers(String schedulerapp_id, String containerid_id, String rmcontainer_id) {
        this.schedulerapp_id = schedulerapp_id;
        this.containerid_id = containerid_id;
        this.rmcontainer_id = rmcontainer_id;
    }
    
    public String getSchedulerapp_id() {
        return schedulerapp_id;
    }

    public String getContainerid_id() {
        return containerid_id;
    }

    public String getRmcontainer_id() {
        return rmcontainer_id;
    }  
}
