package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface YarnVariablesDataAccess<T> extends EntityDataAccess {

    /**
     * To fetch the only row in the table with id zero, param id must be equal
     * to Integer.MIN_VALUE.
     *
     * @param id
     * @return
     * @throws StorageException
     */
    T findById(int id) throws StorageException;

    void prepare(Collection<T> modifided, Collection<T> removed) throws StorageException;
}
