package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopNode;

public interface NodeDataAccess<T> extends EntityDataAccess {

  T findById(String id) throws StorageException;

  Map<String, HopNode> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void createNode(T node) throws StorageException;
}
