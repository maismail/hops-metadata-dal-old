/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author salman
 */
public class HdfsLeaderFactory extends LeaderFactory{

  @Override
  public FinderType<LeDescriptor> getAllFinder() {
    return HdfsLeDescriptor.Finder.All;
  }

  @Override
  public LeDescriptor getNewDescriptor(long id, long counter, String hostName, String httpAddress) {
   return new HdfsLeDescriptor(id,counter,hostName,httpAddress);
  }
}
