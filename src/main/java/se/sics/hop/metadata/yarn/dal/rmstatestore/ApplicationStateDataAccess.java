package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author nickstanogias
 */
public interface ApplicationStateDataAccess<T> extends EntityDataAccess {

    T findByApplicationId(String applicationid) throws StorageException;

    List<T> getAll() throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
