/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface JustLaunchedContainersTableDef {
    
    public static final String TABLE_NAME = "hayarn_justlaunchedcontainers";
    public static final String CONTAINERID = "containerid";
    public static final String CONTAINERSTATUSID = "containerstatusid";
    public static final String RMNODEID = "rmnodeid";
}
