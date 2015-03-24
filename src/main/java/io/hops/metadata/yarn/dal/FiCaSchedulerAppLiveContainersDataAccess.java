package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.FiCaSchedulerAppLiveContainers;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface FiCaSchedulerAppLiveContainersDataAccess<T>
    extends EntityDataAccess {

  Map<String, List<FiCaSchedulerAppLiveContainers>> getAll()
      throws StorageException;


  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;
}
