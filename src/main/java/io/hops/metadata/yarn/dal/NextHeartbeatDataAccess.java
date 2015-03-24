package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Map;

/**
 * DataAccess Interface for the table storing the RMNode.nextheartbeat field.
 * <p/>
 *
 * @param <T>
 */
public interface NextHeartbeatDataAccess<T> extends EntityDataAccess {

  /**
   * @param rmnodeId
   * @return
   * @throws io.hops.exception.StorageException
   */
  boolean findEntry(String rmnodeId) throws StorageException;

  /**
   * @param rmnodeid
   * @param nextHeartbeat
   * @throws StorageException
   */
  void updateNextHeartbeat(String rmnodeid, boolean nextHeartbeat)
      throws StorageException;

  Map<String, Boolean> getAll() throws StorageException;

}
