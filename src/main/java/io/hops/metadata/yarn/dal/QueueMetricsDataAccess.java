package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface QueueMetricsDataAccess<T> extends EntityDataAccess {
  List<T> findAll() throws StorageException, IOException;

  void addAll(Collection<T> toAdd) throws StorageException;
}
