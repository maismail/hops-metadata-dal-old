package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface InvalidateBlockDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  Collection<T> findInvalidatedBlockByStorageId(String storageId) throws StorageException;

  Collection<T> findInvalidatedBlocksByBlockId(long bid) throws StorageException;

  Collection<T> findAllInvalidatedBlocks() throws StorageException;

  T findInvBlockByPkey(Object[] params) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;

  void remove(T invBlk);
}
