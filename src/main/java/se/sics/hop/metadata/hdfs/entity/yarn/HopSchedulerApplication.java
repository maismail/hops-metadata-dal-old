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
public class HopSchedulerApplication {
    private final String appid;
    private final String user;

    public HopSchedulerApplication(String appid, String user) {
        this.appid = appid;
        this.user = user;
    }

    public String getAppid() {
        return appid;
    }

    public String getUser() {
        return user;
    }
}
