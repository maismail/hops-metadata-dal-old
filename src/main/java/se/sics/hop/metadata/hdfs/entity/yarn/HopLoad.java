/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author gautier
 */
public class HopLoad {
  private final String rmHostName;
  private final long load;

  public HopLoad(String rmId, long load) {
    this.rmHostName = rmId;
    this.load = load;
  }

  public String getRmHostName() {
    return rmHostName;
  }

  public long getLoad() {
    return load;
  }
  
  
}
