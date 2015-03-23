package io.hops.metadata.yarn.dal.rmstatestore;

import java.util.List;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

/**
 *
 * @param <T>
 */
public interface RPCDataAccess<T> extends EntityDataAccess {

    /**
   * Retrieves an rpc by its type and userid.
   * @param type
   * @param userid
   * @return
   * @throws io.hops.exception.StorageException
   */
  boolean findByTypeAndUserId(String type, String userid) throws
      StorageException;

  List<T> getAll() throws StorageException;

  void add(T toAdd) throws StorageException;

  void remove(T toRemove) throws StorageException;
}
