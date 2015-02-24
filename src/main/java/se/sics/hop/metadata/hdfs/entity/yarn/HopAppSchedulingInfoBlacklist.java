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
public class HopAppSchedulingInfoBlacklist {
    private String appschedulinginfo_id;
    private String blacklisted;

    public HopAppSchedulingInfoBlacklist(String appschedulinginfo_id, String blacklisted) {
        this.appschedulinginfo_id = appschedulinginfo_id;
        this.blacklisted = blacklisted;
    }

    public String getAppschedulinginfo_id() {
        return appschedulinginfo_id;
    }

    public String getBlacklisted() {
        return blacklisted;
    }
}
