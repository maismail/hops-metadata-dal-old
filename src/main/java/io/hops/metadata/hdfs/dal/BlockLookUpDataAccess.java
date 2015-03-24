package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;

public interface BlockLookUpDataAccess<T> extends EntityDataAccess {
  
  T findByBlockId(long blockId) throws StorageException;
  
  int[] findINodeIdsByBlockIds(long[] blockIds) throws StorageException;
  
  void prepare(Collection<T> modified, Collection<T> removed)
      throws StorageException;
}
