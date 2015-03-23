package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopUpdatedContainerInfo;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopUpdatedContainerInfo;

public interface UpdatedContainerInfoDataAccess<T> extends EntityDataAccess {

  Map<Integer, List<T>> findByRMNode(String rmnodeid) throws StorageException;

  Map<String, Map<Integer, List<HopUpdatedContainerInfo>>> getAll() throws
          StorageException;

  void addAll(Collection<T> containers) throws StorageException;

  void removeAll(Collection<T> containers) throws StorageException;

}
