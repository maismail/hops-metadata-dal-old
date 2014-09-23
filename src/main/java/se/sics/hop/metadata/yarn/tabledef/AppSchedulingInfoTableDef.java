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
public interface AppSchedulingInfoTableDef {
    public static final String TABLE_NAME = "ha_appschedulinginfo";
    public static final String SCHEDULERAPP_ID = "schedulerapp_id";
    public static final String APPID = "appid";
    public static final String QUEUENAME = "queuename";
    public static final String USER = "user";
    public static final String CONTAINERIDCOUNTER = "containeridcounter";
    public static final String PENDING = "pending";
}
