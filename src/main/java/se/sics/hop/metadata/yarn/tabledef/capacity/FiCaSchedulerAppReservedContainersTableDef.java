/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.tabledef.capacity;

/**
 *
 * @author nickstanogias
 */
public interface FiCaSchedulerAppReservedContainersTableDef {
    public static final String TABLE_NAME = "ha_schedulerapp_reservedcontainers";
    public static final String SCHEDULERAPP_ID = "schedulerapp_id";
    public static final String PRIORITY_ID = "priority_id";
    public static final String NODEID = "nodeid";
    public static final String RMCONTAINER_ID = "rmcontainer_id";
}
