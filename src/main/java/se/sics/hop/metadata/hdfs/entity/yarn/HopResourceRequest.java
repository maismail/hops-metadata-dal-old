/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn;

public class HopResourceRequest {
    private final String id;
    private final int priority;
    private final String name;
    private final byte[] resourcerequeststate;

    public HopResourceRequest(String id, int priority, String name, byte[] resourcerequeststate) {
        this.id = id;
        this.priority = priority;
        this.name = name;
        this.resourcerequeststate = resourcerequeststate;
    }

    public String getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public byte[] getResourcerequeststate() {
        return resourcerequeststate;
    }
}
