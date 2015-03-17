package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopFinishedApplications;

public interface FinishedApplicationsDataAccess<T> extends EntityDataAccess {

    List<T> findByRMNode(String id) throws StorageException;

    Map<String,List<HopFinishedApplications>> getAll() throws StorageException;
    
    T findEntry(String rmnodeid, int applicationId) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
