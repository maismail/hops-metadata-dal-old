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
public class HopAllocatedContainers {
    private final int allocateresponse_id;
    private final int container_id;

    public HopAllocatedContainers(int allocateresponse_id, int container_id) {
        this.allocateresponse_id = allocateresponse_id;
        this.container_id = container_id;
    }

    public int getAllocateresponse_id() {
        return allocateresponse_id;
    }

    public int getContainer_id() {
        return container_id;
    }
    
}
