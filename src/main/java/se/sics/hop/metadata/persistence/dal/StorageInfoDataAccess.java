package se.sics.hop.metadata.persistence.dal;

import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author hooman
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface StorageInfoDataAccess<T> extends EntityDataAccess {

  T findByPk(int infoType) throws StorageException;

  void prepare(T storageInfo) throws StorageException;
}
