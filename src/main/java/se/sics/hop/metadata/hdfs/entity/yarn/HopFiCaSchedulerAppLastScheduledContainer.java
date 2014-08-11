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
public class HopFiCaSchedulerAppLastScheduledContainer {
    private final String ficaschedulerapp_id;
    private final int priority_id;
    private final long time;

    public HopFiCaSchedulerAppLastScheduledContainer(String ficaschedulerapp_id, int priority_id, long time) {
        this.ficaschedulerapp_id = ficaschedulerapp_id;
        this.priority_id = priority_id;
        this.time = time;
    }

    public String getFicaschedulerapp_id() {
        return ficaschedulerapp_id;
    }

    public int getPriority_id() {
        return priority_id;
    }

    public long getTime() {
        return time;
    }
}
