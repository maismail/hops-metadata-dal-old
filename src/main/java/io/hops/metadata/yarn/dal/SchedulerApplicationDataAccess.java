

package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.HopSchedulerApplication;

public interface SchedulerApplicationDataAccess<T> extends EntityDataAccess {

    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
    
    Map<String, HopSchedulerApplication> getAll()throws StorageException;
}
