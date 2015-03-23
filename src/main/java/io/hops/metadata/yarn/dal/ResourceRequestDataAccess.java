

package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopResourceRequest;

public interface ResourceRequestDataAccess<T> extends EntityDataAccess {

    Map<String, List<HopResourceRequest>>  getAll() throws StorageException;
            
  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;
}
