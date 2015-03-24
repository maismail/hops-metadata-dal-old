package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.SchedulerApplication;

import java.util.Collection;
import java.util.Map;

public interface SchedulerApplicationDataAccess<T> extends EntityDataAccess {

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  Map<String, SchedulerApplication> getAll() throws StorageException;
}
