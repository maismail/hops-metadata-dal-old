package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;

public interface LeaseDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  Collection<T> findByTimeLimit(long timeLimit) throws StorageException;

  Collection<T> findAll() throws StorageException;

  T findByPKey(String holder) throws StorageException;

  T findByHolderId(int holderId) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newLeases,
      Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
