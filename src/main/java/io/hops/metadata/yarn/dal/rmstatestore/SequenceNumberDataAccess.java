package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface SequenceNumberDataAccess<T> extends EntityDataAccess {

  T findById(int id) throws StorageException;

  void add(T toAdd) throws StorageException;
}
