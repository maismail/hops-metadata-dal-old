package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopResource;

public interface ResourceDataAccess<T> extends EntityDataAccess {

    T findEntry(String id, int type, int parent) throws StorageException;

    Map<String, Map<Integer, Map<Integer, HopResource>>> getAll() throws
          StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

    void add(T resourceNode) throws StorageException;
}
