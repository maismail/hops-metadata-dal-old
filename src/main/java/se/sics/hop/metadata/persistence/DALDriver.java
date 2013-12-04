package se.sics.hop.metadata.persistence;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class DALDriver {

  public static DALStorageFactory load(String driverJarPath, String storageFactoryClassName) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    URL driverPath = new File(driverJarPath).toURI().toURL();
    ClassLoader cl = new URLClassLoader(new URL[]{driverPath});
    Class sfc = cl.loadClass(storageFactoryClassName);
    return (DALStorageFactory) sfc.newInstance();
  }
}
