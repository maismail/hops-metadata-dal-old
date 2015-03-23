package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface ApplicationStateDataAccess<T> extends EntityDataAccess {

    T findByApplicationId(String applicationid) throws StorageException;

    List<T> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  void add(T toAdd) throws StorageException;

  void remove(T toRemove) throws StorageException;
}
