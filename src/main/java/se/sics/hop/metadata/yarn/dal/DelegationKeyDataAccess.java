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
import se.sics.hop.metadata.hdfs.entity.yarn.HopDelegationKey;

/**
 *
 * @author nickstanogias
 */
public interface DelegationKeyDataAccess<T> extends EntityDataAccess {
    T findByKey(int key) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    public void createDTMasterKeyEntry(HopDelegationKey hopDelegationKey);

    List<T> getAll() throws StorageException;
}
