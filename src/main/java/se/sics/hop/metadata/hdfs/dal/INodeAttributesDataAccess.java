package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author salman
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface INodeAttributesDataAccess<T> extends EntityDataAccess {

  T findAttributesByPk(Integer inodeId, Integer partKey) throws StorageException;
  
  Collection<T> findAttributesByPkList(Map<Integer,Integer> inodes) throws StorageException;

  void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
