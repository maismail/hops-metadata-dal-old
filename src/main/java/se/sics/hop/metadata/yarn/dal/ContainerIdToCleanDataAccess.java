package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopContainerId;

public interface ContainerIdToCleanDataAccess<T> extends EntityDataAccess {

  List<T> findByRMNode(String rmnodeId) throws StorageException;

  Map<String, Set<HopContainerId>> getAll() throws StorageException;

  public void addAll(Collection<T> containers) throws StorageException;

  public void removeAll(Collection<T> containers) throws StorageException;

}
