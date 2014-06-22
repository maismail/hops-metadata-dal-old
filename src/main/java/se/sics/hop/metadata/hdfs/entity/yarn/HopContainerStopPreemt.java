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
public class HopContainerStopPreemt {
    private int ficaschedulerapp_id;
    private int container_id;

    public HopContainerStopPreemt(int ficaschedulerapp_id, int container_id) {
        this.ficaschedulerapp_id = ficaschedulerapp_id;
        this.container_id = container_id;
    }

    public int getFicaschedulerapp_id() {
        return ficaschedulerapp_id;
    }

    public int getContainer_id() {
        return container_id;
    }
    
    
}
