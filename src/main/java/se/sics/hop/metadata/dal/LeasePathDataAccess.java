package se.sics.hop.metadata.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface LeasePathDataAccess<T> extends EntityDataAccess {

  Collection<T> findByHolderId(int holderId) throws StorageException;

  Collection<T> findByPrefix(String prefix) throws StorageException;

  Collection<T> findAll() throws StorageException;

  T findByPKey(String path) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
