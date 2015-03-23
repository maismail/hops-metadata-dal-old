package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface RMStateVersionDataAccess<T> extends EntityDataAccess {

    T findById(int id) throws StorageException;

    void add(T modified) throws StorageException;
}
