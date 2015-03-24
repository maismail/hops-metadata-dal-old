package io.hops.metadata.yarn.dal.capacity;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;

public interface FiCaSchedulerAppReservedContainersDataAccess<T>
    extends EntityDataAccess {
  T findById(int id) throws StorageException;

  void prepare(Collection<T> modified, Collection<T> removed)
      throws StorageException;
}
