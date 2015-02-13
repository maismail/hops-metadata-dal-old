package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopNodeHBResponse;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface NodeHBResponseDataAccess<T> extends EntityDataAccess {

    T findById(String rmnodeid) throws StorageException;

    Map<String, HopNodeHBResponse> getAll() throws StorageException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createNodeHBResponse(T nodehbresponse) throws StorageException;
}
