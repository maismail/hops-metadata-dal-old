/*
 * Copyright 2012 Apache Software Foundation.
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
package se.sics.hop.metadata.hdfs.entity.hop;

import se.sics.hop.metadata.hdfs.entity.CounterType;
import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author salman
 */
public class LeDescriptor implements Comparable<LeDescriptor>, Cloneable {

  public static final int DEFAULT_PARTITION_VALUE = 0;

  public static enum Finder implements FinderType<LeDescriptor> {

    ById, AllByCounterGTN, AllByIDLT, All;

    @Override
    public Class getType() {
      return LeDescriptor.class;
    }
  }

  public static enum Counter implements CounterType<LeDescriptor> {

    All, AllPredecessors, AllSuccessors;

    @Override
    public Class getType() {
      return LeDescriptor.class;
    }
  }
  private long id;
  private long counter;
  private String hostName;
  private String httpAddress;
  private final int partitionVal;

  public LeDescriptor(long id, long counter, String hostName, String httpAddress) {
    this.id = id;
    this.counter = counter;
    this.hostName = hostName;
    this.httpAddress = httpAddress;
    this.partitionVal = 0;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCounter() {
    return counter;
  }

  public void setCounter(long counter) {
    this.counter = counter;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getHttpAddress() {
     return httpAddress;
  }

  public void setHttpAddress(String httpAddress) {
      this.httpAddress = httpAddress;
  }

  public int getPartitionVal() {
    return partitionVal;
  }

  @Override
  public int compareTo(LeDescriptor l) {

    if (this.id < l.getId()) {
      return -1;
    } else if (this.id == l.getId()) {
      return 0;
    } else if (this.id > l.getId()) {
      return 1;
    } else {
      throw new IllegalStateException("Leader.java: compareTo(...) is confused.");
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof LeDescriptor) {
      LeDescriptor l = (LeDescriptor) obj;
      //both are equal if all the fields match
      if (this.id == l.getId()
              && this.counter == l.getCounter()
              && this.hostName.equals(l.getHostName())) {
        return true;
      } else {
        return false;
      }
    } else {
      throw new ClassCastException("Leader.java: equals(...) can not compare the objects");
    }
  }

  @Override
  public int hashCode() {
    int hash = 1;
    hash = hash * 31 + this.hostName.hashCode();
    hash = hash * 31 + (new Long(id)).hashCode();
    hash = hash * 31 + (new Long(counter)).hashCode();
    return hash;
  }

  @Override
  public String toString() {
    return this.id + ", " + hostName + ", " + counter ;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return new LeDescriptor(id, counter, hostName, httpAddress);
  }
}
