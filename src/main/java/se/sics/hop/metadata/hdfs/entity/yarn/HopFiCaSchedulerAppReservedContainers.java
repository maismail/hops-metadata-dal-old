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
public class HopFiCaSchedulerAppReservedContainers {
    private int ficaschedulerapp_id;
    private int priority_id;
    private int nodeid;
    private int rmcontainer;

    public HopFiCaSchedulerAppReservedContainers(int ficaschedulerapp_id, int priority_id, int nodeid, int rmcontainer) {
        this.ficaschedulerapp_id = ficaschedulerapp_id;
        this.priority_id = priority_id;
        this.nodeid = nodeid;
        this.rmcontainer = rmcontainer;
    }

    public int getFicaschedulerapp_id() {
        return ficaschedulerapp_id;
    }

    public int getPriority_id() {
        return priority_id;
    }

    public int getNodeid() {
        return nodeid;
    }

    public int getRmcontainer() {
        return rmcontainer;
    }
}
