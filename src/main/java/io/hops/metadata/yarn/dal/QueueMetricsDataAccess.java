

package io.hops.metadata.yarn.dal;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface QueueMetricsDataAccess<T> extends EntityDataAccess {
    List<T> findAll() throws StorageException, IOException;
    
    void addAll(Collection<T> toAdd) throws StorageException;
}
