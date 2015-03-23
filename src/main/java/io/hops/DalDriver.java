package io.hops;

import io.hops.exception.StorageInitializtionException;

public class DalDriver {

  public static DalStorageFactory load(String storageFactoryClassName) throws
      StorageInitializtionException {
    try {
      return (DalStorageFactory) Class.forName(storageFactoryClassName).newInstance();
    } catch (ClassNotFoundException ex) {
      throw new StorageInitializtionException(ex);
    } catch (InstantiationException ex) {
      throw new StorageInitializtionException(ex);
    } catch (IllegalAccessException ex) {
      throw new StorageInitializtionException(ex);
    }
  }
}
