package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerStatusDataAccess<T> extends EntityDataAccess {

    T findById(int id) throws StorageException;

    /**
     * Retrieve all container statuses related
     *
     * @param uciId
     * @return
     * @throws StorageException
     */
    List<T> findByUpdatedContainerInfoId(int uciId) throws StorageException;

    /**
     * Type is either "NEW" or "COMPLETED".
     * @param uciId
     * @param type
     * @return
     * @throws StorageException 
     */
    List<T> findByUpdatedContainerInfoIdAndType(int uciId, String type) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createContainerStatus(T containerstatus) throws StorageException;
}
