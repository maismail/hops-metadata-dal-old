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
    private final String reservedcontainerId;
    private final String reservedappschedulableId;

    public HopFSSchedulerNode(String rmnodeid, int numcontainers, String reservedcontainerId, String reservedappschedulableId) {
        this.rmnodeid = rmnodeid;
        this.numcontainers = numcontainers;
        this.reservedcontainerId = reservedcontainerId;
        this.reservedappschedulableId = reservedappschedulableId;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

    public int getNumcontainers() {
        return numcontainers;
    }

    public String getReservedcontainerId() {
        return reservedcontainerId;
    }

    public String getReservedappschedulableId() {
        return reservedappschedulableId;
    }
}
