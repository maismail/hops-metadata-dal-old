package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.yarn.entity.HopLaunchedContainers;
import io.hops.metadata.common.EntityDataAccess;

public interface LaunchedContainersDataAccess<T> extends EntityDataAccess {


    void addAll(Collection<T> toAdd) throws StorageException;
    void removeAll(Collection<T> toRemove) throws StorageException;
        
    Map<String, List<HopLaunchedContainers>> getAll() throws StorageException;
}
