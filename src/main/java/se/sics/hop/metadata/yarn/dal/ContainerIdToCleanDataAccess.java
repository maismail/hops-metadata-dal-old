package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerIdToCleanDataAccess<T> extends EntityDataAccess {

    T findEntry(String rmnodeId, String containerid) throws StorageException;

    List<T> findByRMNode(String rmnodeId) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
