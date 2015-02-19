/*
 * Copyright 2014 Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.sics.hop.transaction.lock;

import se.sics.hop.exception.StorageException;
import se.sics.hop.exception.TransactionContextException;
import se.sics.hop.metadata.hdfs.entity.FinderType;
import se.sics.hop.transaction.EntityManager;

import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 * @author Steffen Grohsschmiedt <steffeng@sics.se>
 */
public abstract class HopsLock implements Comparable<HopsLock>{
  private static boolean setPartitionKeyEnabled = false;

  /*
   * The Order of entries in Type defines the order
   * by which it's acquired
   */
  public static enum Type{
    INode,
    Block,
    NameNodeLease,
    Lease,
    LeasePath,
    Variable,
    LeDescriptor,
    Replica,
    CorruptReplica,
    ExcessReplica,
    ReplicaUnderConstruction,
    InvalidatedBlock,
    UnderReplicatedBlock,
    PendingBlock,
    QuotaUpdate,
    EncodingStatus,
    BlockChecksum,
    Test
  }

  protected HopsLock() {

  }

  protected final static TransactionLockTypes.LockType DEFAULT_LOCK_TYPE = TransactionLockTypes.LockType.READ_COMMITTED;
  
  protected abstract void acquire(TransactionLocks locks) throws IOException;
  
  protected abstract Type getType();

  @Override
  public int compareTo(HopsLock o) {
    return getType().compareTo(o.getType());
  }
  
  protected static void setLockMode(TransactionLockTypes.LockType mode) throws StorageException {
    switch (mode) {
      case WRITE:
        EntityManager.writeLock();
        break;
      case READ:
        EntityManager.readLock();
        break;
      case READ_COMMITTED:
        EntityManager.readCommited();
        break;
    }
  }

  protected <T> Collection<T> acquireLockList(
          TransactionLockTypes.LockType lock,
          FinderType<T> finder,
          Object... param) throws StorageException,
      TransactionContextException {

    setLockMode(lock);
    if (param == null) {
      return EntityManager.findList(finder);
    } else {
      return EntityManager.findList(finder, param);
    }
  }

  protected <T> T acquireLock(
          TransactionLockTypes.LockType lock,
          FinderType<T> finder, Object... param)
      throws StorageException, TransactionContextException {

    setLockMode(lock);
    if (param == null) {
      return null;
    }
    return EntityManager.find(finder, param);
  }

  static void enableSetPartitionKey(boolean enable) {
    setPartitionKeyEnabled = enable;
  }
  
  static boolean isSetPartitionKeyEnabled() {
    return setPartitionKeyEnabled;
  }
}
