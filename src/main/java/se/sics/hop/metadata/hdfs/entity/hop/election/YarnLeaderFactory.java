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
public class YarnLeaderFactory extends LeaderFactory{
  
  @Override
  public FinderType<LeDescriptor> getAllFinder() {
    HdfsLeDescriptor.Finder finder = HdfsLeDescriptor.Finder.All;
    finder.setType(YarnLeDescriptor.class);
    return finder;
  }

  @Override
  public FinderType<LeDescriptor> getByIdFinder() {
    HdfsLeDescriptor.Finder finder = HdfsLeDescriptor.Finder.ById;
    finder.setType(YarnLeDescriptor.class);
    return finder;
  }
  
  @Override
  public LeDescriptor getNewDescriptor(long id, long counter, String hostName, String httpAddress) {
   return new YarnLeDescriptor(id,counter,hostName,httpAddress);
  }

  @Override
  public LeDescriptor cloneDescriptor(LeDescriptor desc) {
    return new YarnLeDescriptor(desc.getId(), desc.getCounter(), desc.getHostName(), desc.getHttpAddress());  
  }
}
