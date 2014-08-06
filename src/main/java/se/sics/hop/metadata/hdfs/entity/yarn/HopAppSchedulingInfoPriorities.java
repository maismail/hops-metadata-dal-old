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
public class HopAppSchedulingInfoPriorities {
    private final String appschedulinginfo_id;
    private final int priority_id;

    public HopAppSchedulingInfoPriorities(String appschedulinginfo_id, int priority_id) {
        this.appschedulinginfo_id = appschedulinginfo_id;
        this.priority_id = priority_id;
    }

    public String getAppschedulinginfo_id() {
        return appschedulinginfo_id;
    }

    public int getPriority_id() {
        return priority_id;
    }
}
