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
public class HopAppState {
    private final String applicationid;
    private final byte[] appstate;

    public HopAppState(String applicationid, byte[] appstate) {
        this.applicationid = applicationid;
        this.appstate = appstate;
    }

    public String getApplicationid() {
        return applicationid;
    }

    public byte[] getAppstate() {
        return appstate;
    }
}
