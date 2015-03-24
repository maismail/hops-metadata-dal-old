package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.LaunchedContainers;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface LaunchedContainersDataAccess<T> extends EntityDataAccess {


  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  Map<String, List<LaunchedContainers>> getAll() throws StorageException;
}
