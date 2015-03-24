package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.hdfs.entity.QuotaUpdate;

import java.util.Collection;
import java.util.List;

public interface QuotaUpdateDataAccess<T> extends EntityDataAccess {

  public void prepare(Collection<T> modified, Collection<T> removed)
      throws StorageException;

  public List<QuotaUpdate> findLimited(int limit) throws StorageException;

  public List<QuotaUpdate> findByInodeId(int inodeId) throws StorageException;
}
