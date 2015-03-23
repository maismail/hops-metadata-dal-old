

package io.hops.metadata.yarn.dal;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.entity.yarn.HopFiCaSchedulerAppNewlyAllocatedContainers;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopFiCaSchedulerAppNewlyAllocatedContainers;

public interface FiCaSchedulerAppNewlyAllocatedContainersDataAccess<T> extends EntityDataAccess {
    List<T> findById(String ficaId) throws StorageException;
    
    Map<String, List<HopFiCaSchedulerAppNewlyAllocatedContainers>> getAll() throws IOException;
    
    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
    
}
