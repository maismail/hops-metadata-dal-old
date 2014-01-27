package se.sics.hop.metadata.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface ReplicaDataAccess<T> extends EntityDataAccess {

  List<T> findReplicasById(long id) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}