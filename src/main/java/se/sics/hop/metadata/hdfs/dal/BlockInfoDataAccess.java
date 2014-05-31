package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface BlockInfoDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  T findById(long blockId, int inodeId) throws StorageException;

  List<T> findByInodeId(int inodeId) throws StorageException;

  List<T> findAllBlocks() throws StorageException;

  List<T> findByStorageId(int storageId) throws StorageException;

  List<T> findByIds(long[] blockIds, int[] inodeIds) throws StorageException;
    
  List<Long> findByStorageIdOnlyIds(int storageId) throws StorageException;
  
  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}
