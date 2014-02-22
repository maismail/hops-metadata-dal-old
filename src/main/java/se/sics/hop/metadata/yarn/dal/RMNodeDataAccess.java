package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 * @param <T>
 */
public interface RMNodeDataAccess<T> extends EntityDataAccess {

    T findByNodeId(int nodeid) throws StorageException;

    T findByHostNameCommandPort(String hostName, int httpPort) throws StorageException;

    T findByHostName(String hostName) throws StorageException;

    List<T> findByNodeAddress(String nodeAddress) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createRMNode(T rmNode) throws StorageException;
}
