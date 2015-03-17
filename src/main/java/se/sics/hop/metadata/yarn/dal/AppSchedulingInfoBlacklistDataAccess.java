

package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopAppSchedulingInfoBlacklist;

public interface AppSchedulingInfoBlacklistDataAccess<T> extends EntityDataAccess {
    List<T> findById(String id) throws StorageException;

    Map<String, List<HopAppSchedulingInfoBlacklist>> getAll() throws StorageException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
