package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopNodeHBResponse;

public interface NodeHBResponseDataAccess<T> extends EntityDataAccess {

  T findById(String rmnodeid) throws StorageException;

    Map<String, HopNodeHBResponse> getAll() throws StorageException;
    
    void add(T toAdd) throws StorageException;

}
