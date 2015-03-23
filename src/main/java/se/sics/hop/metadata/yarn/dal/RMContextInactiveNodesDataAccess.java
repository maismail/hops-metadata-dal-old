package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface RMContextInactiveNodesDataAccess<T> extends EntityDataAccess {

    /**
     * Return all inactive nodes from ndb.
     * @return
     * @throws StorageException 
     */
    List<T> findAll() throws StorageException;

    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
}
