package io.hops.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import io.hops.exception.StorageException;
import io.hops.exception.StorageException;

public abstract class DalAdaptor<HDFSClass, DALClass> {

  public Collection<DALClass> convertHDFStoDAL(Collection<HDFSClass> hdfsCollection)
      throws StorageException {
    Collection<DALClass> dalCollection = new ArrayList<DALClass>();
    if (hdfsCollection != null) {
      for (HDFSClass hdfsClass : hdfsCollection) {
        dalCollection.add(convertHDFStoDAL(hdfsClass));
      }
    }
    return dalCollection;
  }

  public abstract DALClass convertHDFStoDAL(HDFSClass hdfsClass)
      throws StorageException;

  public Collection<HDFSClass> convertDALtoHDFS(Collection<DALClass> dalCollection)
      throws StorageException {
    Collection<HDFSClass> hdfsCollection = null;
    if (dalCollection != null) {
      try {
        hdfsCollection = dalCollection.getClass().newInstance();
      } catch (InstantiationException ex) {
        throw new StorageException(ex);
      } catch (IllegalAccessException ex) {
        throw new StorageException(ex);
      }
      for (DALClass dalClass : dalCollection) {
        hdfsCollection.add(convertDALtoHDFS(dalClass));
      }
    }
    return hdfsCollection;

  }

  public abstract HDFSClass convertDALtoHDFS(DALClass dalClass)
      throws StorageException;
}
