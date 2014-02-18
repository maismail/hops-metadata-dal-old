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

  public ParallelReadThread(long parentId) {
    super();
    this.parentId = parentId;
  }
  
  public long getParentId() {
    return parentId;
  }
  
}
