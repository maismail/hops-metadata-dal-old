package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface NodeDataAccess<T> extends EntityDataAccess {

    T findById(int id) throws StorageException;

    T findByNameLocation(String name, String location) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void deleteAll(int startId, int endId) throws StorageException;

    void createNode(T node) throws StorageException;
}
