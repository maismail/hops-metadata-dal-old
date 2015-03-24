package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.io.IOException;
import java.util.List;

public interface AppSchedulingInfoDataAccess<T> extends EntityDataAccess {

  List<T> findAll() throws StorageException, IOException;

  void add(T toAdd) throws StorageException;
  
  void remove(T toRemove) throws StorageException;
}
