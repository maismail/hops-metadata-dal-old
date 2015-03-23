package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;

public interface RMStateVersionDataAccess<T> extends EntityDataAccess {

    T findById(int id) throws StorageException;

    void add(T modified) throws StorageException;
}
