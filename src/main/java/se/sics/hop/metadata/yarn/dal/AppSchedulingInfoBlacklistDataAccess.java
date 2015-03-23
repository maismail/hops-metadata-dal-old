

package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopAppSchedulingInfoBlacklist;

public interface AppSchedulingInfoBlacklistDataAccess<T> extends EntityDataAccess {

    Map<String, List<HopAppSchedulingInfoBlacklist>> getAll() throws StorageException;
    
   
    
    public void addAll(Collection<T> toAdd) throws StorageException;
    public void removeAll(Collection<T> toAdd) throws StorageException;
}
