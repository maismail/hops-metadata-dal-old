package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author nickstanogias
 */
public interface ApplicationAttemptStateDataAccess<T> extends EntityDataAccess {

    T findEntry(int applicationid, int applicationattemptid) throws StorageException;

    List<T> findByApplicationId(int applicationid) throws StorageException;

    List<String> findApplicationAttemptIdStrByApplicationId(String applicationid) throws StorageException;
    
    List<T> findApplicationAttemptIdByApplicationId(String applicationid) throws StorageException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createApplicationAttemptStateEntry(T entry) throws StorageException;
}
