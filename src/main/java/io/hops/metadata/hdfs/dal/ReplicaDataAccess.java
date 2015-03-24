package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface ReplicaDataAccess<T> extends EntityDataAccess {

  List<T> findReplicasById(long blockId, int inodeId) throws StorageException;
  
  List<T> findReplicasByINodeId(int inodeId) throws StorageException;
  
  List<T> findReplicasByINodeIds(int[] inodeIds) throws StorageException;
  
  List<T> findReplicasByStorageId(int storageId) throws StorageException;
  
  List<T> findReplicasByPKS(long[] blockIds, int[] inodesIds, int[] sids)
      throws StorageException;
  
  int countAllReplicasForStorageId(int sid) throws StorageException;
  
  void prepare(Collection<T> removed, Collection<T> newed,
      Collection<T> modified) throws StorageException;
}