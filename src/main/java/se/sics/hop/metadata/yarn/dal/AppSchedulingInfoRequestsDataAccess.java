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
public interface AppSchedulingInfoRequestsDataAccess<T> extends EntityDataAccess {
    T findEntry(int appSchedulingInfoId, int priorityId, String name) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
    
    void createAppSchedulingInfoRequestsEntry(T entry) throws StorageException;
    
    List<T> getAllByAppSchedulingInfoId(int appSchedulingInfoId) throws StorageException;
}
