package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface PendingBlockDataAccess<T> extends EntityDataAccess {

  List<T> findByTimeLimitLessThan(long timeLimit) throws StorageException;

  List<T> findAll() throws StorageException;

  T findByPKey(long blockId) throws StorageException;

  int countValidPendingBlocks(long timeLimit) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
