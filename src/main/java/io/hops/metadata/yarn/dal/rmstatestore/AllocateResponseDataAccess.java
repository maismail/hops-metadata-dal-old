package io.hops.metadata.yarn.dal.rmstatestore;


import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface AllocateResponseDataAccess<T> extends EntityDataAccess {
  void addAll(Collection<T> entry) throws StorageException;

  void removeAll(Collection<T> entry) throws StorageException;
  
  List<T> getAll() throws StorageException;
}
