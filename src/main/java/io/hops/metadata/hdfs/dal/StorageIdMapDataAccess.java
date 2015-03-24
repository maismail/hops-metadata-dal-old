package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;

public interface StorageIdMapDataAccess<T> extends EntityDataAccess {

  void add(T s) throws StorageException;

  T findByPk(String storageId) throws StorageException;

  Collection<T> findAll() throws StorageException;
}
