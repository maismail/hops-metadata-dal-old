package io.hops.metadata.yarn.dal.rmstatestore;

import java.util.List;

import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;
import io.hops.metadata.hdfs.entity.yarn.rmstatestore.HopDelegationKey;

public interface DelegationKeyDataAccess<T> extends EntityDataAccess {

    void remove(T removed) throws StorageException;

    public void createDTMasterKeyEntry(HopDelegationKey hopDelegationKey) throws StorageException;

    List<T> getAll() throws StorageException;
}
