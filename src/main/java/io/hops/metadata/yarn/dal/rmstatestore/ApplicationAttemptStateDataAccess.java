package io.hops.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.yarn.entity.rmstatestore.HopApplicationAttemptState;
import io.hops.metadata.common.EntityDataAccess;

public interface ApplicationAttemptStateDataAccess<T> extends EntityDataAccess {
T findEntry(String applicationid, String applicationattemptid) throws
    StorageException;

  Map<String, List<HopApplicationAttemptState>> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  void createApplicationAttemptStateEntry(T entry) throws StorageException;
}
