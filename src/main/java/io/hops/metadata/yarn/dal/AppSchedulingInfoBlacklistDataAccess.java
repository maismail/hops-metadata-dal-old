package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.AppSchedulingInfoBlacklist;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface AppSchedulingInfoBlacklistDataAccess<T>
    extends EntityDataAccess {

  Map<String, List<AppSchedulingInfoBlacklist>> getAll()
      throws StorageException;


  public void addAll(Collection<T> toAdd) throws StorageException;

  public void removeAll(Collection<T> toAdd) throws StorageException;
}
