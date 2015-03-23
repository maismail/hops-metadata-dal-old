package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopRMContainer;

public interface RMContainerDataAccess<T> extends EntityDataAccess {


    Map<String, HopRMContainer> getAll() throws StorageException;
     
    void addAll(Collection<T> toAdd) throws StorageException;
    
    void removeAll(Collection<T> toRemove) throws StorageException;
    
    void add(T rmcontainer) throws StorageException;
}
