package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;

public interface LeDescriptorDataAccess<T> extends EntityDataAccess {

  T findByPkey(long id, int partitionKey) throws StorageException;

  Collection<T> findAll() throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}
