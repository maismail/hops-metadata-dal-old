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
public class HopFifoSchedulerApps {
    private int fifoscheduler_id;
    private int applicationattemptid_id;
    private int ficaschedulerapp_id;

    
    public HopFifoSchedulerApps(int fifoscheduler_id, int applicationattemptid_id, int ficaschedulerapp_id) {
        this.fifoscheduler_id = fifoscheduler_id;
        this.applicationattemptid_id = applicationattemptid_id;
        this.ficaschedulerapp_id = ficaschedulerapp_id;
    }
        
    public int getFifoscheduler_id() {
        return fifoscheduler_id;
    }

    public int getApplicationattemptid_id() {
        return applicationattemptid_id;
    }

    public int getFicaschedulerapp_id() {
        return ficaschedulerapp_id;
    }
}
