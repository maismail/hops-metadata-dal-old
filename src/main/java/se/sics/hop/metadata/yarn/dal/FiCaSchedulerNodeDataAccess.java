package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface FiCaSchedulerNodeDataAccess<T> extends EntityDataAccess {

  void add(T toAdd) throws StorageException;
  
  void addAll(Collection<T> toAdd) throws StorageException;
  
  void removeAll(Collection<T> toRemove) throws StorageException;
    
    List<T> getAll() throws StorageException;
}
