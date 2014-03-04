package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface UpdatedContainerInfoDataAccess<T> extends EntityDataAccess {

    T findById(int id) throws StorageException;

    List<T> findByRMNodeId(int rmnodeid) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createUpdatedContainerInfo(T updatedContainerInfo) throws StorageException;
    /**
     * Remove all instances of UpdatedContainerInfo that belong to a particular
     * RMNode.
     * @param rmnodeid
     * @throws StorageException 
     */
    void clear(List<T> toRemove) throws StorageException;
}
