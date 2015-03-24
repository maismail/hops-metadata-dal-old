package io.hops.metadata.yarn.dal.fair;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;

public interface FSSchedulerNodeDataAccess<T> extends EntityDataAccess {

  T findById(String id) throws StorageException;

  void prepare(Collection<T> modified, Collection<T> removed)
      throws StorageException;

  void createFSSchedulerNode(T node) throws StorageException;
}
