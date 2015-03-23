package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.RMContainer;

public interface RMContainerDataAccess<T> extends EntityDataAccess {


    Map<String, RMContainer> getAll() throws StorageException;
     
    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
    
    void add(T rmcontainer) throws StorageException;
}
