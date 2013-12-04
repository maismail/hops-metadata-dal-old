package se.sics.hop.metadata.persistence;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class DALWrapper<HDFSClass, DALClass> {

  public Collection<DALClass> convertHDFStoDAL(Collection<HDFSClass> hdfsCollection) {
    Collection<DALClass> dalCollection = new ArrayList<DALClass>();
    if (hdfsCollection != null) {
      for (HDFSClass hdfsClass : hdfsCollection) {
        dalCollection.add(convertHDFStoDAL(hdfsClass));
      }
    }
    return dalCollection;
  }

  public abstract DALClass convertHDFStoDAL(HDFSClass hdfsClass);

  public Collection<HDFSClass> convertDALtoHDFS(Collection<DALClass> dalCollection) {
    Collection<HDFSClass> hdfsCollection = new ArrayList<HDFSClass>();
    if (dalCollection != null) {
      for (DALClass dalClass : dalCollection) {
        hdfsCollection.add(convertDALtoHDFS(dalClass));
      }
    }
    return hdfsCollection;
  }

  public abstract HDFSClass convertDALtoHDFS(DALClass dalClass);
}
