/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.hop.election;

import se.sics.hop.metadata.hdfs.entity.FinderType;
import se.sics.hop.metadata.hdfs.entity.hop.var.HopVariable;

public abstract class LeDescriptorFactory {
  
  public abstract HopVariable.Finder getVarsFinder();
  
  public abstract FinderType<LeDescriptor> getAllFinder();
  
  public abstract FinderType<LeDescriptor> getByIdFinder();
  
  public abstract LeDescriptor cloneDescriptor(LeDescriptor desc);
  
  public abstract LeDescriptor getNewDescriptor(long id, long counter, String hostName, String httpAddress);
  
}
