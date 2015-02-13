package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopJustLaunchedContainers;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface JustLaunchedContainersDataAccess<T> extends EntityDataAccess {

    T findEntry(String hostname, int commandport, int containerId) throws StorageException;

    List<T> findAll() throws StorageException;

    List<T> findByRMNode(String id) throws StorageException;

    Map<String, List<HopJustLaunchedContainers>> getAll() throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

}
