/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn.capacity;

public class HopFiCaSchedulerAppReservedContainers {
    private final String schedulerapp_id;
    private final int priority_id;
    private final int nodeid;
    private final String rmcontainer_id;

    public HopFiCaSchedulerAppReservedContainers(String schedulerapp_id, int priority_id, int nodeid, String rmcontainer_id) {
        this.schedulerapp_id = schedulerapp_id;
        this.priority_id = priority_id;
        this.nodeid = nodeid;
        this.rmcontainer_id = rmcontainer_id;
    }

    public String getSchedulerapp_id() {
        return schedulerapp_id;
    }

    public int getPriority_id() {
        return priority_id;
    }

    public int getNodeid() {
        return nodeid;
    }

    public String getRmcontainer_id() {
        return rmcontainer_id;
    }
}
