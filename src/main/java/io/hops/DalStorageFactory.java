package io.hops;

import io.hops.exception.StorageInitializtionException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Properties;

public interface DalStorageFactory {

  public void setConfiguration(Properties conf)
      throws StorageInitializtionException;

  public StorageConnector getConnector();

  public EntityDataAccess getDataAccess(Class type);
}
