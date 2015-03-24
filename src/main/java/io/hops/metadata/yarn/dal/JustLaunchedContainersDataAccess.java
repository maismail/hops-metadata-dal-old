package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.JustLaunchedContainers;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface JustLaunchedContainersDataAccess<T> extends EntityDataAccess {

  List<T> findByRMNode(String id) throws StorageException;

  Map<String, List<JustLaunchedContainers>> getAll() throws StorageException;

  void addAll(Collection<T> containers) throws StorageException;

  void removeAll(Collection<T> containers) throws StorageException;
}
