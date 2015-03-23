package io.hops;

import io.hops.exception.StorageException;
import io.hops.exception.StorageException;
import java.util.Properties;
import io.hops.metadata.hdfs.dal.EntityDataAccess;

public interface StorageConnector<T> {
   
  public void setConfiguration(Properties conf) throws StorageException;

  public <T> T obtainSession() throws StorageException;

  public void beginTransaction() throws StorageException;

  public void commit() throws StorageException;

  public void rollback() throws StorageException;

  public boolean formatStorageNonTransactional() throws StorageException;
  
  public boolean formatStorage() throws StorageException;
  
  public boolean formatStorage(Class<? extends EntityDataAccess>... das) throws StorageException;
  
  public boolean isTransactionActive() throws StorageException;

  public void stopStorage()throws StorageException;

  public void readLock()throws StorageException;

  public void writeLock()throws StorageException;

  public void readCommitted()throws StorageException;

  public void setPartitionKey(Class className, Object key)throws StorageException;
}
