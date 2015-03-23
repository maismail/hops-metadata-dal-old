package io.hops.metadata.yarn.dal.rmstatestore;


import java.util.Collection;
import java.util.List;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface AllocateResponseDataAccess<T> extends EntityDataAccess {
  void addAll(Collection<T> entry) throws StorageException;

  void removeAll(Collection<T> entry) throws StorageException;
  
  List<T> getAll() throws StorageException;
}
