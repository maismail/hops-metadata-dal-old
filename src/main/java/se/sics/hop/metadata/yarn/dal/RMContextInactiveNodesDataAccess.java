package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMContextInactiveNodesDataAccess<T> extends EntityDataAccess {

    /**
     * Find Map entry by host.
     *
     * @param rmcontextId
     * @param host
     * @return
     * @throws StorageException
     */
    T findById(String host) throws StorageException;

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
}
