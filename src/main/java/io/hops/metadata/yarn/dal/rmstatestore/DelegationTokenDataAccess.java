package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.rmstatestore.DelegationToken;

import java.util.List;

public interface DelegationTokenDataAccess<T> extends EntityDataAccess {

  void remove(T removed) throws StorageException;

  public void createDelegationTokenEntry(DelegationToken hopDelegationToken)
      throws StorageException;

  List<T> getAll() throws StorageException;
}
