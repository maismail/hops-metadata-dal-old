package se.sics.hop.metadata.persistence;

import se.sics.hop.metadata.persistence.dal.EntityDataAccess;
import se.sics.hop.metadata.persistence.exceptions.StorageInitializtionException;

/**
 * 
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface DALStorageFactory {

  public void setConfiguration(String configFile) throws StorageInitializtionException;

  public StorageConnector getConnector();

  public EntityDataAccess getDataAccess(Class type);
}
