package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author Hooman <hooman@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface BlockTokenKeyDataAccess<T> extends EntityDataAccess {

  T findByKeyId(int keyId) throws StorageException;

  T findByKeyType(short keyType) throws StorageException;

  List<T> findAll() throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;
}
