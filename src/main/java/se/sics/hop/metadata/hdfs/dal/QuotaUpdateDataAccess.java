package se.sics.hop.metadata.hdfs.dal;

import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.entity.hdfs.HopINodeCandidatePK;
import se.sics.hop.metadata.hdfs.entity.hop.QuotaUpdate;

import java.util.Collection;
import java.util.List;

public interface QuotaUpdateDataAccess<T> extends EntityDataAccess {

  public void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

  public List<QuotaUpdate> findLimited(int limit) throws StorageException;

  public List<QuotaUpdate> findByInodeId(int inodeId) throws StorageException;
}
