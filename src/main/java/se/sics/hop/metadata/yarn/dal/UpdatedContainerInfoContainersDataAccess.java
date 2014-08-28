package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface UpdatedContainerInfoContainersDataAccess<T> extends EntityDataAccess {

    T findEntry(int containerstatusId, int uciId, int type) throws StorageException;

    List<T> findByUpdatedContainerInfoId(int uciId) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
