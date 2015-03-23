

package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.exception.StorageException;
import io.hops.metadata.hdfs.dal.EntityDataAccess;


public interface FullRMNodeDataAccess<T> extends EntityDataAccess {

  T findByNodeId(String nodeId) throws StorageException;
}
