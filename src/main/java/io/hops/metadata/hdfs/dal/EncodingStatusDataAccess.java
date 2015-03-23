package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;

import java.util.Collection;

public interface EncodingStatusDataAccess<T> extends EntityDataAccess {

  void add(T status) throws StorageException;

  void update(T status) throws StorageException;

  void delete(T status) throws StorageException;

  T findByInodeId(int inodeId) throws StorageException;

  T findByParityInodeId(int inodeId) throws StorageException;

  Collection<T> findRequestedEncodings(long limit) throws StorageException;

  int countRequestedEncodings() throws StorageException;

  Collection<T> findRequestedRepairs(long limit) throws StorageException;

  int countRequestedRepairs() throws StorageException;

  Collection<T> findActiveEncodings() throws StorageException;

  int countActiveEncodings() throws StorageException;

  Collection<T> findEncoded(long limit) throws StorageException;

  int countEncoded() throws StorageException;

  Collection<T> findActiveRepairs() throws StorageException;

  int countActiveRepairs() throws StorageException;

  Collection<T> findRequestedParityRepairs(long limit) throws StorageException;

  int countRequestedParityRepairs() throws StorageException;

  Collection<T> findActiveParityRepairs() throws StorageException;

  int countActiveParityRepairs() throws StorageException;

  void setLostBlockCount(int n);

  int getLostBlockCount();

  void setLostParityBlockCount(int n);

  int getLostParityBlockCount();

  Collection<T> findDeleted(long limit) throws StorageException;

  Collection<T> findRevoked() throws StorageException;
}
