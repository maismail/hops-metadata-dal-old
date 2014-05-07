package se.sics.hop.metadata.hdfs.dal;

import se.sics.hop.exception.StorageException;

import java.util.Collection;

public interface EncodingStatusDataAccess<T> extends EntityDataAccess {

  void add(T status) throws StorageException;

  void update(T status) throws StorageException;

  void delete(T status) throws StorageException;

  T findByInodeId(long inodeId) throws StorageException;

  Collection<T> findRequestedEncodings(long limit) throws StorageException;

  int countRequestedEncodings() throws StorageException;

  Collection<T> findActiveEncodings() throws StorageException;

  int countActiveEncodings() throws StorageException;

  Collection<T> findEncoded(long limit) throws StorageException;

  int countEncoded() throws StorageException;

  Collection<T> findActiveRepairs() throws StorageException;

  int countActiveRepairs() throws StorageException;
}
