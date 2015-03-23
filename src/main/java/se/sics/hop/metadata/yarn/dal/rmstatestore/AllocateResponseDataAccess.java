package se.sics.hop.metadata.yarn.dal.rmstatestore;


import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface AllocateResponseDataAccess<T> extends EntityDataAccess {
  void addAll(Collection<T> entry) throws StorageException;

  void removeAll(Collection<T> entry) throws StorageException;
  
  List<T> getAll() throws StorageException;
}
