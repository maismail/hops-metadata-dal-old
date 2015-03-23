
package io.hops.metadata.yarn.dal;

import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface RMLoadDataAccess<T> extends EntityDataAccess {
  void update(T entry)throws StorageException;
  Map<String, T> getAll() throws StorageException;
}
