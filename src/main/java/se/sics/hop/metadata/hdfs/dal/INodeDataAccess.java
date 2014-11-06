package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.INodeIdentifier;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 * @author Mahmoud Ismail <maism@sics.se>
 * @author salman <salman@sics.se>
 */
public interface INodeDataAccess<T> extends EntityDataAccess {
  
  T indexScanfindInodeById(int inodeId) throws StorageException;

  List<T> indexScanFindInodesByParentId(int parentId) throws StorageException;

  T pkLookUpFindInodeByNameAndParentId(String name, int parentId) throws StorageException;

  List<T> getINodesPkBatched(String[] names, int[] parentIds) throws StorageException;
    
  List<INodeIdentifier> getAllINodeFiles(long startId, long endId) throws StorageException;
  
  boolean haveFilesWithIdsGreaterThan(long id) throws StorageException;
  
  boolean haveFilesWithIdsBetween(long startId, long endId) throws StorageException;
  
  long getMinFileId() throws StorageException;
  
  long getMaxFileId() throws StorageException;
  
  int countAllFiles() throws StorageException;
  
  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;

  int countAll() throws StorageException;
}
