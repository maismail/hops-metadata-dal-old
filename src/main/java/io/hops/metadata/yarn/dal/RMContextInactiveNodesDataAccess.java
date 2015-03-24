package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface RMContextInactiveNodesDataAccess<T> extends EntityDataAccess {

  /**
   * Return all inactive nodes from ndb.
   *
   * @return
   * @throws io.hops.exception.StorageException
   */
  List<T> findAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;
}