package se.sics.hop;

import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.exception.StorageInitializtionException;

/**
 * 
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface DALStorageFactory {

  public void setConfiguration(String configFile) throws StorageInitializtionException;

  public StorageConnector getConnector();

  public EntityDataAccess getDataAccess(Class type);
}
