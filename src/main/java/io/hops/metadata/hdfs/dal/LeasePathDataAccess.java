package io.hops.metadata.hdfs.dal;

import java.util.Collection;

import io.hops.exception.StorageException;

public interface LeasePathDataAccess<T> extends EntityDataAccess {

  Collection<T> findByHolderId(int holderId) throws StorageException;

  Collection<T> findByPrefix(String prefix) throws StorageException;

  Collection<T> findAll() throws StorageException;

  T findByPKey(String path) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
