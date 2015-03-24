package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.ResourceRequest;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface ResourceRequestDataAccess<T> extends EntityDataAccess {

  Map<String, List<ResourceRequest>> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;
}
