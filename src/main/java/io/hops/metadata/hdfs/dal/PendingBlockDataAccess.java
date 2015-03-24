package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface PendingBlockDataAccess<T> extends EntityDataAccess {

  List<T> findByTimeLimitLessThan(long timeLimit) throws StorageException;

  List<T> findAll() throws StorageException;

  T findByPKey(long blockId, int inodeId) throws StorageException;
  
  List<T> findByINodeId(int inodeId) throws StorageException;

  List<T> findByINodeIds(int[] inodeIds) throws StorageException;
  
  int countValidPendingBlocks(long timeLimit) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed,
      Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
