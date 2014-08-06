package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface FifoSchedulerNodesDataAccess<T> extends EntityDataAccess {

    T findById(String nodeidId) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createFifoSchedulerNodesEntry(T entry) throws StorageException;
    
    List<T> getAll() throws StorageException;
}
