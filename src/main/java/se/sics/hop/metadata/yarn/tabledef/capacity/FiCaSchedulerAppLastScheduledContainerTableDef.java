/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.tabledef.capacity;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 */
public interface FiCaSchedulerAppLastScheduledContainerTableDef {
    public static final String TABLE_NAME = "ha_schedulerapp_lastscheduledcontainer";
    public static final String SCHEDULERAPP_ID = "schedulerapp_id";
    public static final String PRIORITY_ID = "priority_id";
    public static final String TIME = "time";
}