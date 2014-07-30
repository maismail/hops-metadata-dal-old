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
public class HopFiCaSchedulerAppNewlyAllocatedContainers {
    private final int ficaschedulerapp_id;
    private final int rmcontainer_id;

    public HopFiCaSchedulerAppNewlyAllocatedContainers(int ficaschedulerapp_id, int rmcontainer_id) {
        this.ficaschedulerapp_id = ficaschedulerapp_id;
        this.rmcontainer_id = rmcontainer_id;
    }

    public int getFicaschedulerapp_id() {
        return ficaschedulerapp_id;
    }

    public int getRmcontainer_id() {
        return rmcontainer_id;
    }
}
