package io.hops.metadata.yarn.dal;

import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.NodeHBResponse;

public interface NodeHBResponseDataAccess<T> extends EntityDataAccess {

  T findById(String rmnodeid) throws StorageException;

    Map<String, NodeHBResponse> getAll() throws StorageException;
    
    void add(T toAdd) throws StorageException;

}
