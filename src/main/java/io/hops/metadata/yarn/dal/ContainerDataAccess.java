package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.entity.yarn.HopContainer;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopContainer;

public interface ContainerDataAccess<T> extends EntityDataAccess {

   Map<String, HopContainer> getAll() throws StorageException;
    
    void addAll(Collection<T> toAdd) throws StorageException;

    void createContainer(T container) throws StorageException;
}
