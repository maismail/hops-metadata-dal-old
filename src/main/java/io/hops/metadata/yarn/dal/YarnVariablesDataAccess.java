package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface YarnVariablesDataAccess<T> extends EntityDataAccess {

    /**
     * To fetch the only row in the table with id zero, param id must be equal
     * to Integer.MIN_VALUE.
     *
     * @param id
     * @return
     * @throws io.hops.exception.StorageException
     */
    T findById(int id) throws StorageException;

    void add(T toAdd) throws StorageException;
}
