

package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopSchedulerApplication;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopSchedulerApplication;

public interface SchedulerApplicationDataAccess<T> extends EntityDataAccess {

    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
    
    Map<String, HopSchedulerApplication> getAll()throws StorageException;
}
