package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface LeaseDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  Collection<T> findByTimeLimit(long timeLimit) throws StorageException;

  Collection<T> findAll() throws StorageException;

  T findByPKey(String holder) throws StorageException;

  T findByHolderId(int holderId) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newLeases, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
