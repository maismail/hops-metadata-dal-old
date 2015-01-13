/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.transaction.context;

import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author salman
 */
public class EntityContextStat implements Comparable {
  
  private String contextName;
  private int newRows;
  private int modifiedRows;
  private int deletedRows;
  private String additionalInfo = "";

  public EntityContextStat(String contextName, int newRows, int modifiedRows, int deletedRows) {
    this.contextName = contextName;
    this.newRows = newRows;
    this.modifiedRows = modifiedRows;
    this.deletedRows = deletedRows;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public String getContextName() {
    return contextName;
  }

  public int getNewRows() {
    return newRows;
  }

  public int getModifiedRows() {
    return modifiedRows;
  }

  public int getDeletedRows() {
    return deletedRows;
  }
    
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
   // Send all output to the Appendable object sb
   Formatter formatter = new Formatter(sb, Locale.US);
   // Explicit argument indices may be used to re-order output.
   formatter.format("%30s %5d %5d %5d %s", contextName, newRows, modifiedRows, deletedRows, additionalInfo);
   
   String msg = formatter.toString();
   return msg;
  }

  @Override
  public int compareTo(Object o) {
    EntityContextStat other = (EntityContextStat)o;
//    return other.getContextName().compareTo(contextName);    
    int myChanges = newRows +  modifiedRows + deletedRows;
    int othersChanges = other.getDeletedRows() + other.getModifiedRows() + other.getNewRows();
    if(myChanges == othersChanges){
      return 0;
    }else if( myChanges > othersChanges ){
      return -1;
    }else {
      return 1;
    }         
  }
}
