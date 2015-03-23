package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopContainerStatus;

public interface ContainerStatusDataAccess<T> extends EntityDataAccess {

  /**
   * Find by ContainerId and RNodeId
   * <p>
   * @param containerId
   * @param rmNodeId
   * @return
   * @throws StorageException
   */
  T findEntry(String containerId, String rmNodeId) throws StorageException;

  Map<String, HopContainerStatus> getAll() throws StorageException;

  void addAll(Collection<T> containerStatus) throws StorageException;

}
