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
public class HopCompletedContainersStatuses {
    private int allocateresponse_id;
    private int containerstatus_id;

    public HopCompletedContainersStatuses(int allocateresponse_id, int containerstatus_id) {
        this.allocateresponse_id = allocateresponse_id;
        this.containerstatus_id = containerstatus_id;
    }

    public int getAllocateresponse_id() {
        return allocateresponse_id;
    }

    public int getContainerstatus_id() {
        return containerstatus_id;
    }
}
