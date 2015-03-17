
package se.sics.hop.metadata.yarn.dal;

import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopLoad;

public interface RMLoadDataAccess<T> extends EntityDataAccess {
  void update(T entry)throws StorageException;
  Map<String, T> getAll() throws StorageException;
}
