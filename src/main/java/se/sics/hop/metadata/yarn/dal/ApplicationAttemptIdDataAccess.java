package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ApplicationAttemptIdDataAccess<T> extends EntityDataAccess {

    List<T> findByAttemptId(String id) throws StorageException;

    T findByAttemptIdAppId(int attemptId, int appId) throws StorageException; 
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createApplicationAttemptId(T applicationattemptid) throws StorageException;
    
    List<T> findAll() throws StorageException;
}
