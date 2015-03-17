package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopContainerStatus;

public interface ContainerStatusDataAccess<T> extends EntityDataAccess {

    T findById(String id) throws StorageException;

    Map<String, HopContainerStatus> getAll() throws StorageException;

    /**
     * Type is either "NEW" or "COMPLETED".
     *
     * @param uciId
     * @param type
     * @return
     * @throws StorageException
     */
    //List<T> findByUpdatedContainerInfoIdAndState(int uciId, String type) throws StorageException;
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createContainerStatus(T containerstatus) throws StorageException;
}
