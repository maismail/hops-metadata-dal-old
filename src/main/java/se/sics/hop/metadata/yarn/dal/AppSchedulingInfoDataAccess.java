
package se.sics.hop.metadata.yarn.dal;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface AppSchedulingInfoDataAccess<T> extends EntityDataAccess {

  List<T> findAll() throws StorageException, IOException;

  void add(T toAdd) throws StorageException;
  
  void remove(T toRemove) throws StorageException;
}
