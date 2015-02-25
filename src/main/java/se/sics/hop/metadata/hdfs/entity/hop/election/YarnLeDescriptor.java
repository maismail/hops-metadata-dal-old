/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.hop.election;

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author salman
 */
public class YarnLeDescriptor extends LeDescriptor {
  public YarnLeDescriptor(long id, long counter, String hostName, String httpAddress) {
    super(id,counter,hostName,httpAddress);
  }
}
