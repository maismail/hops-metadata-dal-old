package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface ExcessReplicaDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  List<T> findExcessReplicaByStorageId(String sId) throws StorageException;

  List<T> findExcessReplicaByBlockId(long bId) throws StorageException;

  T findByPkey(Object[] params) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
