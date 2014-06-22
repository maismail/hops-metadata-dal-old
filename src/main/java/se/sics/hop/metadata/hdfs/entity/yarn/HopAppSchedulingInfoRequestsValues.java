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
public class HopAppSchedulingInfoRequestsValues {
    private int appschedulinginfo_requests_id;
    private int appschedulinginfo_priority;
    private String name;
    private int resourcerequest_id;

    public HopAppSchedulingInfoRequestsValues(int appschedulinginfo_requests_id, int appschedulinginfo_priority, String name, int resourcerequest_id) {
        this.appschedulinginfo_requests_id = appschedulinginfo_requests_id;
        this.appschedulinginfo_priority = appschedulinginfo_priority;
        this.name = name;
        this.resourcerequest_id = resourcerequest_id;
    }

    public int getAppschedulinginfo_requests_id() {
        return appschedulinginfo_requests_id;
    }

    public int getAppschedulinginfo_priority() {
        return appschedulinginfo_priority;
    }

    public String getName() {
        return name;
    }

    public int getResourcerequest_id() {
        return resourcerequest_id;
    }
}
