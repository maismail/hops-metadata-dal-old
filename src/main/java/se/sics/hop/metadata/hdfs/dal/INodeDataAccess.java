package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 * @author salman <salman@sics.se>
 */
public interface INodeDataAccess<T> extends EntityDataAccess {

  T pruneIndexScanByInodeId(int inodeId, int partKey) throws StorageException;
  
  T indexScanfindInodeById(int inodeId) throws StorageException;

  List<T> indexScanFindInodesByParentId(int parentId) throws StorageException;

  T pkLookUpFindInodeByNameAndParentId(String name, int parentId, int partKey) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  int countAll() throws StorageException;
}
