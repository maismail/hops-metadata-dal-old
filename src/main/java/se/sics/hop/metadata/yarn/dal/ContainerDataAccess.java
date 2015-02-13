package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopContainer;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerDataAccess<T> extends EntityDataAccess {

    T findById(String id) throws StorageException;

   Map<String, HopContainer> getAll() throws StorageException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createContainer(T container) throws StorageException;
}
