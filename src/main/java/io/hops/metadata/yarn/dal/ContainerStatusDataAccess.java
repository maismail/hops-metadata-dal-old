package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.ContainerStatus;

import java.util.Collection;
import java.util.Map;

public interface ContainerStatusDataAccess<T> extends EntityDataAccess {

  /**
   * Find by ContainerId and RNodeId
   * <p/>
   *
   * @param containerId
   * @param rmNodeId
   * @return
   * @throws io.hops.exception.StorageException
   */
  T findEntry(String containerId, String rmNodeId) throws StorageException;

  Map<String, ContainerStatus> getAll() throws StorageException;

  void addAll(Collection<T> containerStatus) throws StorageException;

}
