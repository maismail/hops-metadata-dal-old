/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.dal;

import se.sics.hop.exception.StorageException;

public interface MisReplicatedRangeQueueDataAccess  extends EntityDataAccess {
  
  void insert(long start, long end) throws StorageException;
  void remove(long start, long end) throws StorageException;
  int countAll() throws StorageException;
}
