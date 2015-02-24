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
    private final String queuename;

    public HopSchedulerApplication(String appid, String user, String queuename) {
        this.appid = appid;
        this.user = user;
        this.queuename = queuename;
    }

    public String getAppid() {
        return appid;
    }

    public String getUser() {
        return user;
    }

    public String getQueuename() {
        return queuename;
    }
}
