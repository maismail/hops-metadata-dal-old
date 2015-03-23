

package se.sics.hop.metadata.yarn.dal;

import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;


/**
 *
 * @author gautier
 */
public interface FullRMNodeDataAccess<T> extends EntityDataAccess {

  T findByNodeId(String nodeId) throws StorageException;
}
