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
    private final String ficaAppId;
    private final int appId;
    private final String queuename;
    private final String user;
    private final int containeridcounter;
    private final boolean pending;

    public HopAppSchedulingInfo(String ficaAppId, int appId, String queuename, String user, int containeridcounter, boolean pending) {
        this.ficaAppId = ficaAppId;
        this.appId = appId;
        this.queuename = queuename;
        this.user = user;
        this.containeridcounter = containeridcounter;
        this.pending = pending;
    }

    public String getFicaAppId() {
        return ficaAppId;
    }

    public int getAppId() {
        return appId;
    }

    public String getQueuename() {
        return queuename;
    }

    public String getUser() {
        return user;
    }

    public int getContaineridcounter() {
        return containeridcounter;
    }

    public boolean isPending() {
        return pending;
    }

    
}
