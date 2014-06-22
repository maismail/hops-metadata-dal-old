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
    private int id;
    private int applicationattemptid_id;
    private String queue_name;
    private String user;
    private String containeridcounter;

    public HopAppSchedulingInfo(int id, int applicationattemptid_id, String queue_name, String user, String containeridcounter) {
        this.id = id;
        this.applicationattemptid_id = applicationattemptid_id;
        this.queue_name = queue_name;
        this.user = user;
        this.containeridcounter = containeridcounter;
    }

    public int getId() {
        return id;
    }

    public int getApplicationattemptid_id() {
        return applicationattemptid_id;
    }

    public String getQueue_name() {
        return queue_name;
    }

    public String getUser() {
        return user;
    }

    public String getContaineridcounter() {
        return containeridcounter;
    }
}
