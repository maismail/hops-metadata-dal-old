/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.hop;

/**
 *
 * @author salman
 */
public class HdfsLeDescriptor extends LeDescriptor {
//  private HdfsLeDescriptor(){}
  public HdfsLeDescriptor(long id, long counter, String hostName, String httpAddress) {
    super(id,counter,hostName,httpAddress);
  }
}
