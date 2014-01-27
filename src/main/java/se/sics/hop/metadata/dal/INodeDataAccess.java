package se.sics.hop.metadata.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface INodeDataAccess<T> extends EntityDataAccess {

  T findInodeById(long inodeId) throws StorageException;

  List<T> findInodesByParentIdSortedByName(long parentId) throws StorageException;

  T findInodeByNameAndParentId(String name, long parentId) throws StorageException;

  List<T> findInodesByIds(List<Long> ids) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  int countAll() throws StorageException;
}
