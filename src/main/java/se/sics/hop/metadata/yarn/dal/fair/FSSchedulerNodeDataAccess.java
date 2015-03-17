

package se.sics.hop.metadata.yarn.dal.fair;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface FSSchedulerNodeDataAccess<T> extends EntityDataAccess{

    T findById(String id) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createFSSchedulerNode(T node) throws StorageException;
}
