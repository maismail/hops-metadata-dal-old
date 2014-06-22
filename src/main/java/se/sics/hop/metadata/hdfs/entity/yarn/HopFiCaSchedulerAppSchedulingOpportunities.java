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
public class HopFiCaSchedulerAppSchedulingOpportunities {
    private int ficaschedulerapp_id;
    private int priority_id;

    public HopFiCaSchedulerAppSchedulingOpportunities(int ficaschedulerapp_id, int priority_id) {
        this.ficaschedulerapp_id = ficaschedulerapp_id;
        this.priority_id = priority_id;
    }

    public int getFicaschedulerapp_id() {
        return ficaschedulerapp_id;
    }

    public int getPriority_id() {
        return priority_id;
    }
}
