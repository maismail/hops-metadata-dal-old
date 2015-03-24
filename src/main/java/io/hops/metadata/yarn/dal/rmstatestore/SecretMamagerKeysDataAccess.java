package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.List;

/**
 * @param <T>
 */
public interface SecretMamagerKeysDataAccess<T> extends EntityDataAccess {

  List<T> getAll() throws StorageException;

  void add(T toAdd) throws StorageException;

  void remove(T toRemove) throws StorageException;
}
