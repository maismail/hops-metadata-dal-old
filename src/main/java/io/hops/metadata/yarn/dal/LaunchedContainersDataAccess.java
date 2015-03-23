package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.entity.yarn.HopLaunchedContainers;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopLaunchedContainers;

public interface LaunchedContainersDataAccess<T> extends EntityDataAccess {


    void addAll(Collection<T> toAdd) throws StorageException;
    void removeAll(Collection<T> toRemove) throws StorageException;
        
    Map<String, List<HopLaunchedContainers>> getAll() throws StorageException;
}
