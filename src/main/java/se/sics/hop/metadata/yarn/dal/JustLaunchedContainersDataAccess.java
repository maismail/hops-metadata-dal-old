package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface JustLaunchedContainersDataAccess<T> extends EntityDataAccess {

    T findEntry(String hostname, int commandport, int containerId) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createJustLaunchedContainerEntry(T entry) throws StorageException;
}
