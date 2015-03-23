package io.hops.metadata.hdfs.dal;

import java.util.Collection;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface BlockLookUpDataAccess<T> extends EntityDataAccess {
  
  T findByBlockId(long blockId) throws StorageException;
  
  int[] findINodeIdsByBlockIds(long[] blockIds) throws StorageException;
  
  void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
