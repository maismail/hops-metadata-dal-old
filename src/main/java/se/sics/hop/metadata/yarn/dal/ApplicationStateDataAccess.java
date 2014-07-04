package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author nickstanogias
 */
public interface ApplicationStateDataAccess<T> extends EntityDataAccess {

    T findByApplicationId(int applicationid) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}