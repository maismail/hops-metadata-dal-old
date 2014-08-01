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
public class HopAppSchedulingInfo {
    private final int id;
    private final int appattemptid_id;
    private final String queuename;
    private final String user;
    private final String containeridcounter;
    private final boolean pending;

    public HopAppSchedulingInfo(int id, int appattemptid_id, String queuename, String user, String containeridcounter, boolean pending) {
        this.id = id;
        this.appattemptid_id = appattemptid_id;
        this.queuename = queuename;
        this.user = user;
        this.containeridcounter = containeridcounter;
        this.pending = pending;
    }

    public int getId() {
        return id;
    }

    public int getAppattemptid_id() {
        return appattemptid_id;
    }

    public String getQueuename() {
        return queuename;
    }

    public String getUser() {
        return user;
    }

    public String getContaineridcounter() {
        return containeridcounter;
    }

    public boolean isPending() {
        return pending;
    }
}
