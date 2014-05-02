package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface ExcessReplicaDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  List<T> findExcessReplicaByStorageId(int sId) throws StorageException;

  List<T> findExcessReplicaByBlockId(long bId, int inodeId, int partKey) throws StorageException;
  
  List<T> findExcessReplicaByINodeId(int inodeId, int partKey) throws StorageException;

  T findByPK(long bId, int sId, int inodeId, int partKey) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
