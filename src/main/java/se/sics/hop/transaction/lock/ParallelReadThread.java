/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.transaction.lock;

/**
 *
 * @author salman
 */
public abstract class ParallelReadThread extends Thread {
  private long parentId;
  private Object  params;

  public ParallelReadThread(long parentId, Object params) {
    super();
    this.parentId = parentId;
    this.params = params;
  }
  
  public long getParentId() {
    return parentId;
  }

  public Object getParams() {
    return params;
  }
  
}
