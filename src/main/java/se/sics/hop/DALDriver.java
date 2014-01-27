package se.sics.hop;

import se.sics.hop.exception.StorageInitializtionException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class DALDriver {

  public static DALStorageFactory load(String storageFactoryClassName) throws StorageInitializtionException {
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
