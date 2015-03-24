package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface RMContextActiveNodesDataAccess<T> extends EntityDataAccess {
  /**
   * Find Map entry by provided ids of RMContext and NodeId.
   *
   * @param nodeidId
   * @return
   * @throws StorageException
   */
  T findEntry(String nodeidId) throws StorageException;

  /**
   * Return all nodes from ndb.
   * <p/>
   *
   * @return
   * @throws StorageException
   */
  List<T> findAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

}
