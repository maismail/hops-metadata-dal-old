

package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopSchedulerApplication;

public interface SchedulerApplicationDataAccess<T> extends EntityDataAccess {

    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
    
    Map<String, HopSchedulerApplication> getAll()throws StorageException;
}
