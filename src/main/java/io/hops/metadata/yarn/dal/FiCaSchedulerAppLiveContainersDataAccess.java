

package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.yarn.entity.FiCaSchedulerAppLiveContainers;
import io.hops.metadata.common.EntityDataAccess;

public interface FiCaSchedulerAppLiveContainersDataAccess<T> extends EntityDataAccess {
    
    Map<String, List<FiCaSchedulerAppLiveContainers>> getAll()throws
        StorageException;
    
    
    void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;
}
