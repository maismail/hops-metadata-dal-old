package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface ReplicaDataAccess<T> extends EntityDataAccess {

  List<T> findReplicasById(long blockId, int partKey) throws StorageException;
  
  List<T> findReplicasByINodeId(int inodeId, int partKey) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}