package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopContainer;

public interface ContainerDataAccess<T> extends EntityDataAccess {

   Map<String, HopContainer> getAll() throws StorageException;
    
    void addAll(Collection<T> toAdd) throws StorageException;

    void createContainer(T container) throws StorageException;
}
