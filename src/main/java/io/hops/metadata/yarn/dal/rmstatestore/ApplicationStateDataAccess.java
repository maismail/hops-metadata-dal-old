package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface ApplicationStateDataAccess<T> extends EntityDataAccess {

  T findByApplicationId(String applicationid) throws StorageException;

  List<T> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  void add(T toAdd) throws StorageException;

  void remove(T toRemove) throws StorageException;
}
