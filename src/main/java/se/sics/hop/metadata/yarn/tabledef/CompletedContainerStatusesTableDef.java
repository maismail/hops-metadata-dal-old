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
public interface CompletedContainerStatusesTableDef {
    public static final String TABLE_NAME = "ha_completedcontainersstatuses";
    public static final String ALLOCATERESPONSE_ID = "allocateresponse_id";
    public static final String CONTAINERSTATUS_ID = "containerstatus_id";
}
