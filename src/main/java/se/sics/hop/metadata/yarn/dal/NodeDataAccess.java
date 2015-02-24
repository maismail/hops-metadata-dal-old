package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopNode;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface NodeDataAccess<T> extends EntityDataAccess {

    T findById(String id) throws StorageException;

    T findByNameLocation(String name, String location) throws StorageException;

    Map<String, HopNode> getAll() throws StorageException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createNode(T node) throws StorageException;
}
