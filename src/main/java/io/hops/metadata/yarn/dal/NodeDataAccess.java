package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.Node;

import java.util.Collection;
import java.util.Map;

public interface NodeDataAccess<T> extends EntityDataAccess {

  T findById(String id) throws StorageException;

  Map<String, Node> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void createNode(T node) throws StorageException;
}
