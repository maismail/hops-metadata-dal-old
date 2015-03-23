package io.hops.metadata.yarn.dal.rmstatestore;

import java.util.List;
import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.rmstatestore.DelegationToken;

public interface DelegationTokenDataAccess<T> extends EntityDataAccess {

    void remove(T removed) throws StorageException;

    public void createDelegationTokenEntry(DelegationToken hopDelegationToken) throws StorageException;

    List<T> getAll() throws StorageException;
}
