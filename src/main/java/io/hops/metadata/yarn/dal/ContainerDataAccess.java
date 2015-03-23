package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.yarn.entity.HopContainer;
import io.hops.metadata.common.EntityDataAccess;

public interface ContainerDataAccess<T> extends EntityDataAccess {

   Map<String, HopContainer> getAll() throws StorageException;
    
    void addAll(Collection<T> toAdd) throws StorageException;

    void createContainer(T container) throws StorageException;
}
