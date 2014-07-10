/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.tabledef.rmstatestore;

/**
 *
 * @author nickstanogias
 */
public interface ApplicationAttemptStateTableDef {
   public static final String TABLE_NAME = "applicationattemptstate";
   public static final String APPLICATIONID = "applicationid";
   public static final String APPLICATIONATTEMPTID = "applicationattemptid";
   public static final String APPLICATIONATTEMPTSTATE = "applicationattemptstate";
}
