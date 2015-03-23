
package io.hops.metadata.yarn.dal.rmstatestore;

import java.util.List;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

/**
 *
 * @param <T>
 */
public interface SecretMamagerKeysDataAccess<T> extends EntityDataAccess {

  List<T> getAll()throws StorageException;

  void add(T toAdd) throws StorageException;

  void remove(T toRemove) throws StorageException;
}
