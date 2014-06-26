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
public class HopAppSchedulingInfoRequests {
    private final int appschedulinginfo_id;
    private final int priority_id;
    private final String name;
    private final int resourcerequest_id;

    public HopAppSchedulingInfoRequests(int appschedulinginfo_id, int priority_id, String name, int resourcerequest_id) {
        this.appschedulinginfo_id = appschedulinginfo_id;
        this.priority_id = priority_id;
        this.name = name;
        this.resourcerequest_id = resourcerequest_id;
    }

    public int getAppschedulinginfo_id() {
        return appschedulinginfo_id;
    }

    public int getPriority_id() {
        return priority_id;
    }

    public String getName() {
        return name;
    }

    public int getResourcerequest_id() {
        return resourcerequest_id;
    }

}
