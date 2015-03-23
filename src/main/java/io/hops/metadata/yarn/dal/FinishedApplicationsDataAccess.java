package io.hops.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.HopFinishedApplications;

public interface FinishedApplicationsDataAccess<T> extends EntityDataAccess {

  List<T> findByRMNode(String id) throws StorageException;

  Map<String, List<HopFinishedApplications>> getAll() throws StorageException;

  public void addAll(Collection<T> applications) throws StorageException;

  public void removeAll(Collection<T> applications) throws StorageException;

}
