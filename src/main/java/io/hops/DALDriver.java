package io.hops;

import io.hops.exception.StorageInitializtionException;
import io.hops.exception.StorageInitializtionException;

public class DALDriver {

  public static DALStorageFactory load(String storageFactoryClassName) throws
      StorageInitializtionException {
    try {
      return (DALStorageFactory) Class.forName(storageFactoryClassName).newInstance();
    } catch (ClassNotFoundException ex) {
      throw new StorageInitializtionException(ex);
    } catch (InstantiationException ex) {
      throw new StorageInitializtionException(ex);
    } catch (IllegalAccessException ex) {
      throw new StorageInitializtionException(ex);
    }
  }
}
