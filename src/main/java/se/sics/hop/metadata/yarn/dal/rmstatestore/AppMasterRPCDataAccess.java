/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface AppMasterRPCDataAccess<T> extends EntityDataAccess {
    T findById(int id) throws StorageException;

    List<T> getAll() throws StorageException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
