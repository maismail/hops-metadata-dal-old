package io.hops.metadata.hdfs.entity.hop.election;

import io.hops.metadata.hdfs.entity.FinderType;
import io.hops.metadata.hdfs.entity.hop.var.HopVariable;

public abstract class LeDescriptorFactory {
  
  public abstract HopVariable.Finder getVarsFinder();
  
  public abstract FinderType<LeDescriptor> getAllFinder();
  
  public abstract FinderType<LeDescriptor> getByIdFinder();
  
  public abstract LeDescriptor cloneDescriptor(LeDescriptor desc);
  
  public abstract LeDescriptor getNewDescriptor(long id, long counter, String hostName, String httpAddress);
  
}
