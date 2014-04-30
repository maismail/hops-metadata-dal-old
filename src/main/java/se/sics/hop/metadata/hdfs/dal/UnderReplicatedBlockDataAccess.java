package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface UnderReplicatedBlockDataAccess<T> extends EntityDataAccess {

  T findByPk(long blockId, int inodeId, int partKey) throws StorageException;

  List<T> findByINodeId(int inodeId, int partKey) throws StorageException;
  
  List<T> findAll() throws StorageException;

  List<T> findByLevel(int level) throws StorageException;

  List<T> findAllLessThanLevel(int level) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;

  int countAll() throws StorageException;

  int countByLevel(int level) throws StorageException;

  int countLessThanALevel(int level) throws StorageException;
}
