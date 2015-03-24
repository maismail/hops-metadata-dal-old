package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

/**
 * @param <T>
 */
public interface PendingEventDataAccess<T> extends EntityDataAccess {

  /**
   * Retrieve all pending events.
   * <p/>
   *
   * @return
   * @throws io.hops.exception.StorageException
   */
  List<T> getAll() throws StorageException;
  
  /**
   * Retrieve all pending events with the given status.
   * <p/>
   *
   * @param status
   * @return
   * @throws StorageException
   */
  List<T> getAll(byte status) throws StorageException;

  /**
   * @param pendingEvent
   * @throws StorageException
   */
  void createPendingEvent(T pendingEvent) throws StorageException;

  /**
   * @param pendingEvent
   * @throws StorageException
   */
  void removePendingEvent(T pendingEvent) throws StorageException;

  /**
   * @param modified
   * @param removed
   * @throws StorageException
   */
  void prepare(Collection<T> modified, Collection<T> removed)
      throws StorageException;
}
