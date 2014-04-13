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

  T findById(long blockId, int partKey) throws StorageException;

  List<T> findByInodeId(int id, int partKey) throws StorageException;

  List<T> findAllBlocks() throws StorageException;

  List<T> findByStorageId(int storageId) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}
