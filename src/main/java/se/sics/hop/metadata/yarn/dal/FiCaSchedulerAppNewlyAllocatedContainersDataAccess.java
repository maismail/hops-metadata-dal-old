

package se.sics.hop.metadata.yarn.dal;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopFiCaSchedulerAppNewlyAllocatedContainers;

public interface FiCaSchedulerAppNewlyAllocatedContainersDataAccess<T> extends EntityDataAccess {
    List<T> findById(String ficaId) throws StorageException;
    
    Map<String, List<HopFiCaSchedulerAppNewlyAllocatedContainers>> getAll() throws IOException;
    
    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
    
}
