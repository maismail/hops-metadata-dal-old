package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface MisReplicatedRangeQueueDataAccess extends EntityDataAccess {
  
  void insert(long start, long end) throws StorageException;

  void remove(long start, long end) throws StorageException;

  int countAll() throws StorageException;
}
