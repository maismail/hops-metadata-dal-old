/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.hop.election;

import se.sics.hop.metadata.hdfs.entity.FinderType;
import se.sics.hop.metadata.hdfs.entity.hop.election.LeDescriptor;

/**
 *
 * @author salman
 */
public class HdfsLeDescriptor extends LeDescriptor {
  public HdfsLeDescriptor(long id, long counter, String hostName, String httpAddress) {
    super(id,counter,hostName,httpAddress);
  }
}
