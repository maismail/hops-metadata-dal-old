package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ResourceDataAccess<T> extends EntityDataAccess {

    T findById(String id) throws StorageException;

    T findEntry(String id, int type, int parent) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createResource(T resourceNode) throws StorageException;
}
