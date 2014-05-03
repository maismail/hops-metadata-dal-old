package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface InvokeRequestDataAccess<T> extends EntityDataAccess {

    /**
     * Create an entry in the table to be picked up by the scheduler.
     *
     * @param invokeRequest
     * @throws StorageException
     */
    void createInvokeRequest(T invokeRequest) throws StorageException;

    /**
     * Returns all rows in the table.
     *
     * @return
     * @throws StorageException
     */
    List<T> findAll() throws StorageException;

	/**
     * Returns the first numberOfRequests from the table. 
     * @param numberOfRequests
     * @return
     * @throws StorageException 
     */
    List<T> findAll(int numberOfRequests) throws StorageException;
    /**
     * Modify and/or delete rows.
     *
     * @param modified
     * @param removed
     * @throws StorageException
     */
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void deleteAll(int startId, int endId) throws StorageException;
}
