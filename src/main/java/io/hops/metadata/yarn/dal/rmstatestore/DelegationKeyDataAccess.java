package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.rmstatestore.DelegationKey;

import java.util.List;

public interface DelegationKeyDataAccess<T> extends EntityDataAccess {

  void remove(T removed) throws StorageException;

  public void createDTMasterKeyEntry(DelegationKey hopDelegationKey)
      throws StorageException;

  List<T> getAll() throws StorageException;
}
