/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author nickstanogias
 */
public interface FifoSchedulerAppsDataAccess<T> extends EntityDataAccess {
    
    T findByAppId(int applicationid) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
    
    void createFifoSchedulerAppsEntry(T entry) throws StorageException;
    
    List<T> getAllByAppId(int appId) throws StorageException;
}
