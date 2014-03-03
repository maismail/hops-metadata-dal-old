package se.sics.hop.metadata.yarn.dal;

import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface YarnVariablesDataAccess<T> extends EntityDataAccess {

    T findById() throws StorageException;
    T findByIdIncrementUpdatedContainerInfo() throws StorageException;
    //T findByIdIncrementUpdatedContainerInfo() throws StorageException;
}
