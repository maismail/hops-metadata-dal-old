package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.hops.exception.StorageException;
import io.hops.metadata.yarn.entity.HopContainerId;
import io.hops.metadata.common.EntityDataAccess;

public interface ContainerIdToCleanDataAccess<T> extends EntityDataAccess {

  List<T> findByRMNode(String rmnodeId) throws StorageException;

  Map<String, Set<HopContainerId>> getAll() throws StorageException;

  public void addAll(Collection<T> containers) throws StorageException;

  public void removeAll(Collection<T> containers) throws StorageException;

}
