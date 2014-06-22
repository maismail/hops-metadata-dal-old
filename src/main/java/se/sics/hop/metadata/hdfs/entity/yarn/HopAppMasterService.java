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
public class HopAppMasterService {
    private final int id;
    private final int scheduler_id;
    private final int rmcontext_id;
    private final int resync;

    public HopAppMasterService(int id, int scheduler_id, int rmcontext_id, int resync) {
        this.id = id;
        this.scheduler_id = scheduler_id;
        this.rmcontext_id = rmcontext_id;
        this.resync = resync;
    }

    public int getId() {
        return id;
    }

    public int getScheduler_id() {
        return scheduler_id;
    }

    public int getRmcontext_id() {
        return rmcontext_id;
    }

    public int getResync() {
        return resync;
    }
    
}
