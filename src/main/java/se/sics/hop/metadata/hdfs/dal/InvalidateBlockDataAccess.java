package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 * @author Salman Niazi <salman@sics.se>
 */
public interface InvalidateBlockDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  Collection<T> findInvalidatedBlockByStorageId(int storageId) throws StorageException;

  Collection<T> findInvalidatedBlocksByBlockId(long bid, int inodeId) throws StorageException;
  
  Collection<T> findInvalidatedBlocksByINodeId(int inodeId) throws StorageException;

  Collection<T> findAllInvalidatedBlocks() throws StorageException;

  T findInvBlockByPkey(long blockId, int storageId, int inodeId) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;

  void remove(T invBlk);
}
