/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopSchedulerApplication;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 */
public interface SchedulerApplicationDataAccess<T> extends EntityDataAccess {
    T findById(String id) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createEntry(T SchedulerApp) throws StorageException; 

    Map<String, HopSchedulerApplication> getAll()throws StorageException;
}
