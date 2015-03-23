package io.hops.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.entity.hdfs.HopINodeCandidatePK;

public interface INodeAttributesDataAccess<T> extends EntityDataAccess {

  T findAttributesByPk(Integer inodeId) throws StorageException;
  
  Collection<T> findAttributesByPkList(List<HopINodeCandidatePK> inodePks) throws StorageException;

  void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
