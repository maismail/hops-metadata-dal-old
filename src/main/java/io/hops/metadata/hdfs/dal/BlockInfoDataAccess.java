package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface BlockInfoDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;
  
  int countAllCompleteBlocks() throws StorageException;

  T findById(long blockId, int inodeId) throws StorageException;

  List<T> findByInodeId(int inodeId) throws StorageException;
  
  List<T> findByInodeIds(int[] inodeIds) throws StorageException;
  
  List<T> findAllBlocks() throws StorageException;

  List<T> findByStorageId(int storageId) throws StorageException;
  
  Set<Long> findByStorageIdOnlyIds(int storageId) throws StorageException;
  
  List<T> findByIds(long[] blockIds, int[] inodeIds) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed,
      Collection<T> modified) throws StorageException;
}