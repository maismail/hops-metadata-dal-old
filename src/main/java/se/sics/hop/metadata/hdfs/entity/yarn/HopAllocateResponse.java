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
public class HopAllocateResponse {
    private final int id;
    private final int limit;

    public HopAllocateResponse(int id, int limit) {
        this.id = id;
        this.limit = limit;
    }

    public int getId() {
        return id;
    }

    public int getLimit() {
        return limit;
    }
    
    
}
