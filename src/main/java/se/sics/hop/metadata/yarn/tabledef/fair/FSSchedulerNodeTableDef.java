/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.tabledef.fair;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 */
public interface FSSchedulerNodeTableDef {
    public static final String TABLE_NAME = "ha_fsscheduler_node";
    public static final String RMNODEID = "rmnodeid";
    public static final String NUMCONTAINERS = "numcontainers";
}
