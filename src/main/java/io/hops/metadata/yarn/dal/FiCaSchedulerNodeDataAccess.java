package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface FiCaSchedulerNodeDataAccess<T> extends EntityDataAccess {

  void add(T toAdd) throws StorageException;
  
  void addAll(Collection<T> toAdd) throws StorageException;
  
  void removeAll(Collection<T> toRemove) throws StorageException;

  List<T> getAll() throws StorageException;
}
