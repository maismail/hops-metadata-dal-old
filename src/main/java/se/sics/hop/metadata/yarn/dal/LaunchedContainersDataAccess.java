package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopLaunchedContainers;

public interface LaunchedContainersDataAccess<T> extends EntityDataAccess {

    T findEntry(String ficaschedulernodeId, String containeridId) throws StorageException;

    List<T> findByFiCaSchedulerNode(String ficaschedulernodeId) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createLaunchedContainersEntry(T ficaschedulernode, T containerId) throws StorageException;
    
    Map<String, List<HopLaunchedContainers>> getAll() throws StorageException;
}
