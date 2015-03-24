package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;

public interface SafeBlocksDataAccess extends EntityDataAccess {
  
  void insert(Collection<Long> safeBlocks) throws StorageException;

  void remove(Long safeBlock) throws StorageException;

  int countAll() throws StorageException;

  void removeAll() throws StorageException;
}
