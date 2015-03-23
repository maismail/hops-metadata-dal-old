package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopRMContainer;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopRMContainer;

public interface RMContainerDataAccess<T> extends EntityDataAccess {


    Map<String, HopRMContainer> getAll() throws StorageException;
     
    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
    
    void add(T rmcontainer) throws StorageException;
}
