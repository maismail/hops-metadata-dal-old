package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.HopNodeHBResponse;

public interface NodeHBResponseDataAccess<T> extends EntityDataAccess {

  T findById(String rmnodeid) throws StorageException;

    Map<String, HopNodeHBResponse> getAll() throws StorageException;
    
    void add(T toAdd) throws StorageException;

}
