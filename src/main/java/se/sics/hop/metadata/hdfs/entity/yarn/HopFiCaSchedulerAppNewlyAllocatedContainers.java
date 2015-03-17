/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn;

public class HopFiCaSchedulerAppNewlyAllocatedContainers {
    private final String schedulerapp_id;
    private final String rmcontainer_id;

    public HopFiCaSchedulerAppNewlyAllocatedContainers(String schedulerapp_id, String rmcontainer_id) {
        this.schedulerapp_id = schedulerapp_id;
        this.rmcontainer_id = rmcontainer_id;
    }

    public String getSchedulerapp_id() {
        return schedulerapp_id;
    }

    public String getRmcontainer_id() {
        return rmcontainer_id;
    }
}
