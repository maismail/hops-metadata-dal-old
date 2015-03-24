package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.hdfs.entity.INodeCandidatePrimaryKey;

import java.util.Collection;
import java.util.List;

public interface INodeAttributesDataAccess<T> extends EntityDataAccess {

  T findAttributesByPk(Integer inodeId) throws StorageException;
  
  Collection<T> findAttributesByPkList(List<INodeCandidatePrimaryKey> inodePks)
      throws StorageException;

  void prepare(Collection<T> modified, Collection<T> removed)
      throws StorageException;
}
