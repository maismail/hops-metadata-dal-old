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
public class HopFifoScheduler {
    
    private int id;
    private int rmcontext;
    private boolean initialized;
    private boolean useportfornodename;
    private int queuemetrics_id;
    private int clusterresource_id;
    private int usedresource_id;

    public HopFifoScheduler(int id, int rmcontext, boolean initialized, boolean useportfornodename, int queuemetrics_id, int clusterresource_id, int usedresource_id) {
        this.id = id;
        this.rmcontext = rmcontext;
        this.initialized = initialized;
        this.useportfornodename = useportfornodename;
        this.queuemetrics_id = queuemetrics_id;
        this.clusterresource_id = clusterresource_id;
        this.usedresource_id = usedresource_id;
    }

    public int getId() {
        return id;
    }

    public int getRmcontext() {
        return rmcontext;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public boolean isUseportfornodename() {
        return useportfornodename;
    }

    public int getQueuemetrics_id() {
        return queuemetrics_id;
    }

    public int getClusterresource_id() {
        return clusterresource_id;
    }

    public int getUsedresource_id() {
        return usedresource_id;
    }
    
    
}
