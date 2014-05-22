package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author salman <salman@sics.se>
 */
public interface BlockLookUpDataAccess<T> extends EntityDataAccess {
  
  T findByBlockId(long blockId) throws StorageException;
  
  int[] findINodeIdsByBlockIds(long[] blockIds) throws StorageException;
  
  void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
