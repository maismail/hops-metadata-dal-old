package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopRMNode;

/**
 *
 * @param <T>
 */
public interface RMNodeDataAccess<T> extends EntityDataAccess {

  T findByNodeId(String nodeid) throws StorageException;

  Map<String, HopRMNode> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  void add(T rmNode) throws StorageException;
}
