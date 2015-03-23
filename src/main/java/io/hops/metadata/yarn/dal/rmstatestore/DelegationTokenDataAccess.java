package io.hops.metadata.yarn.dal.rmstatestore;

import java.util.List;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.rmstatestore.HopDelegationToken;

public interface DelegationTokenDataAccess<T> extends EntityDataAccess {

    void remove(T removed) throws StorageException;

    public void createDelegationTokenEntry(HopDelegationToken hopDelegationToken) throws StorageException;

    List<T> getAll() throws StorageException;
}
