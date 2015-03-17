/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.dal;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopFiCaSchedulerAppNewlyAllocatedContainers;

public interface FiCaSchedulerAppNewlyAllocatedContainersDataAccess<T> extends EntityDataAccess {
    List<T> findById(String ficaId) throws StorageException;
    
    Map<String, List<HopFiCaSchedulerAppNewlyAllocatedContainers>> getAll() throws IOException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
