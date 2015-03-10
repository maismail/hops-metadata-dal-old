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

/**
 *
 * @author gautier
 * @param <T>
 */
public interface SecretMamagerKeysDataAccess<T> extends EntityDataAccess {

  T findByKeyId(String applicationid) throws StorageException;
  List<T> getAll()throws StorageException;
  void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}