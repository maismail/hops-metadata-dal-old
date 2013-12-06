package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface BlockInfoDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  T findById(long blockId) throws StorageException;

  List<T> findByInodeId(long id) throws StorageException;

  List<T> findAllBlocks() throws StorageException;

  List<T> findByStorageId(String storageId) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}
