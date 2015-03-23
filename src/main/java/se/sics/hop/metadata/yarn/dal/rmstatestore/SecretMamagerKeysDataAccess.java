
package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @param <T>
 */
public interface SecretMamagerKeysDataAccess<T> extends EntityDataAccess {

  List<T> getAll()throws StorageException;

  void add(T toAdd) throws StorageException;

  void remove(T toRemove) throws StorageException;
}
