package se.sics.hop;

import java.util.Properties;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.exception.StorageInitializtionException;

public interface DALStorageFactory {

  public void setConfiguration(Properties conf) throws StorageInitializtionException;

  public StorageConnector getConnector();

  public EntityDataAccess getDataAccess(Class type);
}
