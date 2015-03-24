package io.hops.metadata.election.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;

public interface LeDescriptorDataAccess<T> extends EntityDataAccess {

  T findByPkey(long id, int partitionKey) throws StorageException;

  Collection<T> findAll() throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed,
      Collection<T> modified) throws StorageException;
}
