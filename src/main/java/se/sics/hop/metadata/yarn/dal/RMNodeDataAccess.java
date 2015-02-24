package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopRMNode;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 * @param <T>
 */
public interface RMNodeDataAccess<T> extends EntityDataAccess {

    T findByNodeId(String nodeid) throws StorageException;

    T findByHostNameCommandPort(String hostName, int httpPort) throws StorageException;

    T findByHostName(String hostName) throws StorageException;

    Map<String, HopRMNode> getAll() throws StorageException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
    
    void deleteAll(int startId, int endId) throws StorageException;

    void createRMNode(T rmNode) throws StorageException;
}
