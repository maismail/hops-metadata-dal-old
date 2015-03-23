package io.hops;

import java.util.Properties;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.exception.StorageInitializtionException;

public interface DALStorageFactory {

  public void setConfiguration(Properties conf) throws StorageInitializtionException;

  public StorageConnector getConnector();

  public EntityDataAccess getDataAccess(Class type);
}
