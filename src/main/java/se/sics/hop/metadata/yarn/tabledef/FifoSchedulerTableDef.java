/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author nickstanogias
 */
public interface FifoSchedulerTableDef {
    public static final String TABLE_NAME = "ha_fifoscheduler";
    public static final String ID = "id";
    public static final String RMCONTEXT = "rmcontext";
    public static final String INITIALIZED = "initialized";
    public static final String USEPORTFORNODENAME = "useportfornodename";
    public static final String QUEUEMETRICS_ID = "queuemetrics_id";
    public static final String CLUSTERRESOURCE_ID = "clusterresource_id";
    public static final String USEDRESOURCE_ID = "usedresource_id";
}
