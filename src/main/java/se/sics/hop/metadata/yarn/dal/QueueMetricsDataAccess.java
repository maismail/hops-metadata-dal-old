

package se.sics.hop.metadata.yarn.dal;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface QueueMetricsDataAccess<T> extends EntityDataAccess {
    List<T> findAll() throws StorageException, IOException;
    
    void addAll(Collection<T> toAdd) throws StorageException;
}
