package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface LaunchedContainersDataAccess<T> extends EntityDataAccess {

    T findEntry(int ficaschedulernodeId, int containeridId) throws StorageException;

    List<T> findByFiCaSchedulerNode(int ficaschedulernodeId) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createLaunchedContainersEntry(T ficaschedulernode, T containerId) throws StorageException;
}
