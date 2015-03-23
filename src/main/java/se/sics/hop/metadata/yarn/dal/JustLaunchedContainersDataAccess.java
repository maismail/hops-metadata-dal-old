package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopJustLaunchedContainers;

public interface JustLaunchedContainersDataAccess<T> extends EntityDataAccess {

  List<T> findByRMNode(String id) throws StorageException;

  Map<String, List<HopJustLaunchedContainers>> getAll() throws StorageException;

  void addAll(Collection<T> containers) throws StorageException;

  void removeAll(Collection<T> containers) throws StorageException;
}
