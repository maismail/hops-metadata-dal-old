package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

public interface ExcessReplicaDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  List<T> findExcessReplicaByStorageId(int sId) throws StorageException;

  List<T> findExcessReplicaByBlockId(long bId, int inodeId) throws StorageException;
  
  List<T> findExcessReplicaByINodeId(int inodeId) throws StorageException;
  
  List<T> findExcessReplicaByINodeIds(int[] inodeIds) throws StorageException;
   
  T findByPK(long bId, int sId, int inodeId) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
