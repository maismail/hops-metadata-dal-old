package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMContextInactiveNodesDataAccess<T> extends EntityDataAccess {

    /**
     * Find Map entry by provided RMContext id and host.
     *
     * @param rmcontextId
     * @param host
     * @return
     * @throws StorageException
     */
    T findEntry(int rmcontextId, String host) throws StorageException;

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
    void createRMContextInactiveNodesEntry(T entry) throws StorageException;

    /**
     * Retrieve all rmnodes of specific RMContext.
     * @return
     * @throws StorageException 
     */
    List<T> getAllByRMContextId(int rmcontextId) throws StorageException;
}
