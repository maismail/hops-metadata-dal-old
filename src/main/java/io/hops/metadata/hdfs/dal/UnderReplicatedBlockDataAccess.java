package io.hops.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;

import io.hops.exception.StorageException;

public interface UnderReplicatedBlockDataAccess<T> extends EntityDataAccess {

  T findByPk(long blockId, int inodeId) throws StorageException;

  List<T> findByINodeId(int inodeId) throws StorageException;
  
  List<T> findByINodeIds(int[] inodeIds) throws StorageException;
  
  List<T> findAll() throws StorageException;
  
  List<T> findByLevel(int level) throws StorageException;
  
  List<T> findByLevel(int level, int offset, int count) throws StorageException;
  
  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;

  int countAll() throws StorageException;

  int countByLevel(int level) throws StorageException;

  int countLessThanALevel(int level) throws StorageException;
}
