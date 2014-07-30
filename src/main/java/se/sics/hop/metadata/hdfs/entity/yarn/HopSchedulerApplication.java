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
    private final int id;
    private final String user;
    private final int currentattempt_id;

    public HopSchedulerApplication(int id, String user, int currentattempt_id) {
        this.id = id;
        this.user = user;
        this.currentattempt_id = currentattempt_id;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public int getCurrentattempt_id() {
        return currentattempt_id;
    }
}
