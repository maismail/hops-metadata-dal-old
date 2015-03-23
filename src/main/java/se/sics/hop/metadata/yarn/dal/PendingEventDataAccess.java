package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 * @param <T>
 */
public interface PendingEventDataAccess<T> extends EntityDataAccess {

  /**
   * Retrieve all pending events.
   * <p>
   * @return
   * @throws StorageException
   */
  List<T> getAll() throws StorageException;
  
  /**
   * Retrieve all pending events with the given status.
   * <p>
   * @param status
   * @return
   * @throws StorageException
   */
  List<T> getAll(byte status) throws StorageException;

  /**
   *
   * @param pendingEvent
   * @throws StorageException
   */
  void createPendingEvent(T pendingEvent) throws StorageException;

  /**
   *
   * @param pendingEvent
   * @throws StorageException
   */
  void removePendingEvent(T pendingEvent) throws StorageException;

  /**
   *
   * @param modified
   * @param removed
   * @throws StorageException
   */
  void prepare(Collection<T> modified, Collection<T> removed) throws
          StorageException;
}
