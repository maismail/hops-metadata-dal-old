package io.hops.metadata.election.entity;

import io.hops.metadata.common.FinderType;
import io.hops.metadata.common.entity.Variable;

public abstract class LeDescriptorFactory {
  
  public abstract Variable.Finder getVarsFinder();
  
  public abstract FinderType<LeDescriptor> getAllFinder();
  
  public abstract FinderType<LeDescriptor> getByIdFinder();
  
  public abstract LeDescriptor cloneDescriptor(LeDescriptor desc);
  
  public abstract LeDescriptor getNewDescriptor(long id, long counter,
      String hostName, String httpAddress);
  
}
