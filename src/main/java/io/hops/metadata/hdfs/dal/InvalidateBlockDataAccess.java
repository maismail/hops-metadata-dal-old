package io.hops.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;

import io.hops.exception.StorageException;

public interface InvalidateBlockDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  List<T> findInvalidatedBlockByStorageId(int storageId) throws StorageException;

  List<T> findInvalidatedBlocksByBlockId(long bid, int inodeId) throws StorageException;
  
  List<T> findInvalidatedBlocksByINodeId(int inodeId) throws StorageException;

  List<T> findInvalidatedBlocksByINodeIds(int[] inodeIds) throws StorageException;
  
  List<T> findAllInvalidatedBlocks() throws StorageException;

  List<T> findInvalidatedBlocksbyPKS(long[] blockIds, int[] inodesIds, int[] storageIds) throws StorageException;

  T findInvBlockByPkey(long blockId, int storageId, int inodeId) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;

  void removeAllByStorageId(int storageId) throws StorageException;
}
