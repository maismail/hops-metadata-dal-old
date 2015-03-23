
package io.hops.metadata.yarn.dal;

import java.io.IOException;
import java.util.List;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface AppSchedulingInfoDataAccess<T> extends EntityDataAccess {

  List<T> findAll() throws StorageException, IOException;

  void add(T toAdd) throws StorageException;
  
  void remove(T toRemove) throws StorageException;
}
