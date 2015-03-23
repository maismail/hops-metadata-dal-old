

package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.yarn.entity.AppSchedulingInfoBlacklist;
import io.hops.metadata.common.EntityDataAccess;

public interface AppSchedulingInfoBlacklistDataAccess<T> extends EntityDataAccess {

    Map<String, List<AppSchedulingInfoBlacklist>> getAll() throws
        StorageException;
    
   
    
    public void addAll(Collection<T> toAdd) throws StorageException;
    public void removeAll(Collection<T> toAdd) throws StorageException;
}
