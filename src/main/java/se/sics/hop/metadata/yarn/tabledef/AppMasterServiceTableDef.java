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
public interface AppMasterServiceTableDef {
    public static final String TABLE_NAME = "ha_appmasterservice";
    public static final String ID = "id";
    public static final String SCHEDULER_ID = "scheduler_id";
    public static final String RMCONTEXT_ID = "rmcontext_id";
    public static final String RESYNC = "resync";
}
