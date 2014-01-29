package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author Salman <salman@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface LeaderDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  T findByPkey(long id, int partitionKey) throws StorageException;

  Collection<T> findAllByCounterGT(long counter) throws StorageException;

  Collection<T> findAllByIDLT(long id) throws StorageException;

  Collection<T> findAll() throws StorageException;

  int countAllPredecessors(long id) throws StorageException;

  int countAllSuccessors(long id) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}
