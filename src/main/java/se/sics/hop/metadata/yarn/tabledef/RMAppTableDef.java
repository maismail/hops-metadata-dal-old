/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.tabledef;

public interface RMAppTableDef {
    public static final String TABLE_NAME = "ha_rmapp";
    public static final String ID = "id";
    public static final String APPLICATIONID_ID = "applicationid_id";
    public static final String RMCONTEXT_ID = "rmcontext_id";
    public static final String USER = "user";
    public static final String NAME = "name";
    public static final String APPSUBMISSIONCTX_ID = "appsubmissionctx_id";
    public static final String SCHEDULER_ID = "scheduler_id";
    public static final String APPMASTERSERVICE_ID = "appmasterservice_id";
    public static final String DIAGNOSTICS = "diagnostics";
    public static final String MAXAPPATTEMPTS = "maxappattempts";
    public static final String SUBMITTIME = "submittime";
    public static final String APPLICATIONTYPE = "applicationtype";
    public static final String STARTTIME = "starttime";
    public static final String FINISHTIME = "finishtime";
    public static final String CURRENTATTEMPT_ID = "currentattempt_id";
    public static final String ISAPPREMOVALREQUESTSENT = "isappremovalrequestsent";   
}
