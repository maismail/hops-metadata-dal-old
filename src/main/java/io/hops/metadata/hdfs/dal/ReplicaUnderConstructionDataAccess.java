package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface ReplicaUnderConstructionDataAccess<T>
    extends EntityDataAccess {

  List<T> findReplicaUnderConstructionByBlockId(long blockId, int inodeId)
      throws StorageException;

  List<T> findReplicaUnderConstructionByINodeId(int inodeId)
      throws StorageException;
  
  List<T> findReplicaUnderConstructionByINodeIds(int[] inodeIds)
      throws StorageException;
  
  void prepare(Collection<T> removed, Collection<T> newed,
      Collection<T> modified) throws StorageException;
}