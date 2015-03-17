/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore;

public class HopAllocateResponse {

  private final String applicationattemptid;
  private final byte[] allocateResponse;

  public HopAllocateResponse(String applicationattemptid, byte[] allocateResponse) {
    this.applicationattemptid = applicationattemptid;
    this.allocateResponse = allocateResponse;
  }

  public String getApplicationattemptid() {
    return applicationattemptid;
  }

  public byte[] getAllocateResponse() {
    return allocateResponse;
  }
  
}
