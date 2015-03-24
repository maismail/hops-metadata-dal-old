package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.rmstatestore.ApplicationAttemptState;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface ApplicationAttemptStateDataAccess<T> extends EntityDataAccess {
  T findEntry(String applicationid, String applicationattemptid)
      throws StorageException;

  Map<String, List<ApplicationAttemptState>> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  void createApplicationAttemptStateEntry(T entry) throws StorageException;
}
