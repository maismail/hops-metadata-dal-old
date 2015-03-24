package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.Container;

import java.util.Collection;
import java.util.Map;

public interface ContainerDataAccess<T> extends EntityDataAccess {

  Map<String, Container> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void createContainer(T container) throws StorageException;
}
