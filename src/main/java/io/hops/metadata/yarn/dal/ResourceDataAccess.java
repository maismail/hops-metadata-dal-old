package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.Resource;

import java.util.Collection;
import java.util.Map;

public interface ResourceDataAccess<T> extends EntityDataAccess {

  T findEntry(String id, int type, int parent) throws StorageException;

  Map<String, Map<Integer, Map<Integer, Resource>>> getAll()
      throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  void add(T resourceNode) throws StorageException;
}
