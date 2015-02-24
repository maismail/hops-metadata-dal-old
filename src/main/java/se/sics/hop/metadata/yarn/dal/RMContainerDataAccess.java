package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopRMContainer;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMContainerDataAccess<T> extends EntityDataAccess {

    T findById(String id) throws StorageException;

    Map<String, HopRMContainer> getAll() throws StorageException;
     
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createRMContainer(T rmcontainer) throws StorageException;
}
