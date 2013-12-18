package se.sics.hop.metadata.persistence;

import se.sics.hop.metadata.persistence.exceptions.StorageException;
import java.util.Properties;
import se.sics.hop.metadata.persistence.dal.EntityDataAccess;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public interface StorageConnector<T> {

  public void setConfiguration(Properties conf) throws StorageException;

  public <T> T obtainSession() throws StorageException;

  public void beginTransaction() throws StorageException;

  public void commit() throws StorageException;

  public void rollback() throws StorageException;

  public boolean formatStorage() throws StorageException;
  
  public boolean formatStorage(Class<? extends EntityDataAccess>... das) throws StorageException;
  
  public boolean isTransactionActive();

  public void stopStorage();

  public void readLock();

  public void writeLock();

  public void readCommitted();

  public void setPartitionKey(Class className, Object key);
}
