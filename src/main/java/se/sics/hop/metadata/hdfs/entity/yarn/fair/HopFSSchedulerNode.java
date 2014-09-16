/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn.fair;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 */
public class HopFSSchedulerNode {
    
    private final String rmnodeid;
    private final int numcontainers;

    public HopFSSchedulerNode(String rmnodeid, int numcontainers) {
        this.rmnodeid = rmnodeid;
        this.numcontainers = numcontainers;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

    public int getNumcontainers() {
        return numcontainers;
    }
}
