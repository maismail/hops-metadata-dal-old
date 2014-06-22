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
public class HopResponseMap {
    private int appmasterservive_id;
    private int appattemptid_id;
    private int allocateresponse_id;

    public HopResponseMap(int appmasterservive_id, int appattemptid_id, int allocateresponse_id) {
        this.appmasterservive_id = appmasterservive_id;
        this.appattemptid_id = appattemptid_id;
        this.allocateresponse_id = allocateresponse_id;
    }

    public int getAppmasterservive_id() {
        return appmasterservive_id;
    }

    public int getAppattemptid_id() {
        return appattemptid_id;
    }

    public int getAllocateresponse_id() {
        return allocateresponse_id;
    }
    
}
