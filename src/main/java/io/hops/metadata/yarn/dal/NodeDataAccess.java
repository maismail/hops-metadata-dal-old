package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.entity.yarn.HopNode;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopNode;

public interface NodeDataAccess<T> extends EntityDataAccess {

  T findById(String id) throws StorageException;

  Map<String, HopNode> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void createNode(T node) throws StorageException;
}
