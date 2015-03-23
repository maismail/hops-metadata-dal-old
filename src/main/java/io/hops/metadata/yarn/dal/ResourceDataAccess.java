package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopResource;

public interface ResourceDataAccess<T> extends EntityDataAccess {

    T findEntry(String id, int type, int parent) throws StorageException;

    Map<String, Map<Integer, Map<Integer, HopResource>>> getAll() throws
          StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

    void add(T resourceNode) throws StorageException;
}
