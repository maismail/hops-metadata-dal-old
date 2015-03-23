package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.entity.yarn.HopJustLaunchedContainers;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopJustLaunchedContainers;

public interface JustLaunchedContainersDataAccess<T> extends EntityDataAccess {

  List<T> findByRMNode(String id) throws StorageException;

  Map<String, List<HopJustLaunchedContainers>> getAll() throws StorageException;

  void addAll(Collection<T> containers) throws StorageException;

  void removeAll(Collection<T> containers) throws StorageException;
}
