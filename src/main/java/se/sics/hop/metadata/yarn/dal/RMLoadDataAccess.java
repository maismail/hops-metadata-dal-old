/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.yarn.dal;

import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopLoad;

public interface RMLoadDataAccess<T> extends EntityDataAccess {
  void update(T entry)throws StorageException;
  Map<String, T> getAll() throws StorageException;
}
