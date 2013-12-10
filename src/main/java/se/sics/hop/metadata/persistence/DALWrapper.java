package se.sics.hop.metadata.persistence;

import java.util.ArrayList;
import java.util.Collection;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class DALWrapper<HDFSClass, DALClass> {

  public Collection<DALClass> convertHDFStoDAL(Collection<HDFSClass> hdfsCollection) throws StorageException{
    Collection<DALClass> dalCollection = new ArrayList<DALClass>();
    if (hdfsCollection != null) {
      for (HDFSClass hdfsClass : hdfsCollection) {
        dalCollection.add(convertHDFStoDAL(hdfsClass));
      }
    }
    return dalCollection;
  }

  public abstract DALClass convertHDFStoDAL(HDFSClass hdfsClass) throws StorageException;

  public Collection<HDFSClass> convertDALtoHDFS(Collection<DALClass> dalCollection) throws StorageException {
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

  public abstract HDFSClass convertDALtoHDFS(DALClass dalClass)throws StorageException;
}
