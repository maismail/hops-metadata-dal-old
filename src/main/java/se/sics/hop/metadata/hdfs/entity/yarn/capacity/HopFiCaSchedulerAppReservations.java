/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn.capacity;

/**
 *
 * @author nickstanogias
 */
public class HopFiCaSchedulerAppReservations {
    private final String schedulerapp_id;
    private final int priority_id;

    public HopFiCaSchedulerAppReservations(String schedulerapp_id, int priority_id) {
        this.schedulerapp_id = schedulerapp_id;
        this.priority_id = priority_id;
    }

    public String getSchedulerapp_id() {
        return schedulerapp_id;
    }

    public int getPriority_id() {
        return priority_id;
    }
}
