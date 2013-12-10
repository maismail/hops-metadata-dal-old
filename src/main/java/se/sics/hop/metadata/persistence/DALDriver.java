package se.sics.hop.metadata.persistence;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import se.sics.hop.metadata.persistence.exceptions.StorageInitializtionException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class DALDriver {

  //FIXME: remove the jar file path
  public static DALStorageFactory load(String driverJarPath, String storageFactoryClassName) throws StorageInitializtionException{
    try {
          URL driverPath = new File(driverJarPath).toURI().toURL();
          ClassLoader cl = new URLClassLoader(new URL[]{driverPath});
          Class sfc = cl.loadClass(storageFactoryClassName);
          return (DALStorageFactory) sfc.newInstance();
//          return (DALStorageFactory) Class.forName(storageFactoryClassName).newInstance();
    } catch (ClassNotFoundException ex) {
      throw new StorageInitializtionException(ex);
    } catch (InstantiationException ex) {
      throw new StorageInitializtionException(ex);
    } catch (IllegalAccessException ex) {
      throw new StorageInitializtionException(ex);
    } catch (MalformedURLException ex) {
      throw new StorageInitializtionException(ex);
    }
  }
}
