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
public interface FiCaSchedulerAppTableDef {
    public static final String TABLE_NAME = "ha_ficascheduler_app";
    public static final String ID = "id";
    public static final String APPSCHEDULINGINFO_ID = "appschedulinginfo_id";
    public static final String CURRENTRESERVATION_ID = "currentreservation_id";
    public static final String RESOURCELIMIT_ID = "resourcelimit_id";
    public static final String CURRENTCONSUMPTION_ID = "currentconsumption_id"; 
    public static final String ISSTOPPED = "isstopped";
    public static final String RMCONTEXT_ID = "rmcontext_id";
    
}
