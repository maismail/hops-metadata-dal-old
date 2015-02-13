package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMContextActiveNodesDataAccess<T> extends EntityDataAccess {

    /**
     * Find Map entry by provided ids of RMContext and NodeId.
     *
     * @param rmcontextId
     * @param nodeidId
     * @return
     * @throws StorageException
     */
    T findEntry(int rmcontextId, int nodeidId) throws StorageException;

    /**
     * Return all nodes from ndb.
     * @return
     * @throws StorageException 
     */
    List<T> findAll() throws StorageException;
    /**
     * Modify and/or delete table rows.
     *
     * @param modified
     * @param removed
     * @throws StorageException
     */
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    /**
     * Insert row in table.
     *
     * @param entry
     * @throws StorageException
     */
    void createRMContextNodesEntry(T entry) throws StorageException;
}
