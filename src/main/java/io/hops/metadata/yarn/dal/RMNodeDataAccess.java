package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.RMNode;

import java.util.Collection;
import java.util.Map;

/**
 * @param <T>
 */
public interface RMNodeDataAccess<T> extends EntityDataAccess {

  T findByNodeId(String nodeid) throws StorageException;

  Map<String, RMNode> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  void add(T rmNode) throws StorageException;
}
