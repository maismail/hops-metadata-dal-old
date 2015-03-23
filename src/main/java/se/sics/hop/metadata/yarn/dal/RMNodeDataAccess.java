package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopRMNode;

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
