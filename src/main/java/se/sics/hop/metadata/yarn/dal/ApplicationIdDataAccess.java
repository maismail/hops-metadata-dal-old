package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ApplicationIdDataAccess<T> extends EntityDataAccess {

    T findById(String id) throws StorageException;

    T findFinished(int finished) throws StorageException;

    List<T> findAll() throws StorageException;

    T findByAppIdClusterTimestamp(int appid, long clustertimestamp) throws StorageException;

    /**
     * Find all ApplicationIds with finished flag set to true.
     *
     * @return
     * @throws StorageException
     */
    List<T> findFinished() throws StorageException;

    /**
     * Deletes all rows from NDB table.
     *
     * @throws StorageException
     */
    void deleteAll() throws StorageException;

    /**
     * Deletes all rows with finished flag set to true, from NDB table.
     *
     * @throws StorageException
     */
    void deleteFinished(List<T> finished) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createApplicationId(T applicationId) throws StorageException;
}
