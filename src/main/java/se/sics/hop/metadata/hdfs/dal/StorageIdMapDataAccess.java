package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface StorageIdMapDataAccess<T> extends EntityDataAccess {

  void add(T s) throws StorageException;

  T findByPk(String storageId) throws StorageException;

  Collection<T> findAll() throws StorageException;
}
