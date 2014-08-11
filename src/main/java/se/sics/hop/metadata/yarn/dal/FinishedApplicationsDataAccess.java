package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface FinishedApplicationsDataAccess<T> extends EntityDataAccess {

    List<T> findByRMNode(String id) throws StorageException;

    T findEntry(String rmnodeid, int applicationId) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
