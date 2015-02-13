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

import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 *
 * @author salman
 */
public abstract class HopsLeader implements Comparable<HopsLeader> {

  public static final int DEFAULT_PARTITION_VALUE = 0;

  private long id;
  private long counter;
  private long timeStamp;
  private String hostName;
  private String httpAddress;
  private int partitionVal;

  public interface LeaderFinder<T extends HopsLeader> extends FinderType {

  }

  public HopsLeader(long id, long counter, long timeStamp, String hostName,
      String httpAddress, int partitionVal) {
    this.id = id;
    this.counter = counter;
    this.timeStamp = timeStamp;
    this.hostName = hostName;
    this.httpAddress = httpAddress;
    this.partitionVal = partitionVal;
    if (partitionVal != 0) {
      throw new IllegalStateException("Leader.java: partition_val has to be zero");
      // to store all rows on one machine
    }
  }

  public HopsLeader(long id, long counter, long timeStamp, String hostName,
      String httpAddress) {
    this.id = id;
    this.counter = counter;
    this.timeStamp = timeStamp;
    this.hostName = hostName;
    this.httpAddress = httpAddress;
    this.partitionVal = 0; // to store all rows on one machine
  }

  public long getId() {
    return id;
  }

  public long getCounter() {
    return counter;
  }

  public long getTimeStamp() {
    return timeStamp;
  }

  public String getHostName() {
    return hostName;
  }

  public String getHttpAddress() {
     return httpAddress;
  }

  public int getPartitionVal() {
    return partitionVal;
  }

  @Override
  public int compareTo(HopsLeader l) {

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
    if (obj instanceof HopsLeader) {
      HopsLeader l = (HopsLeader) obj;
      //both are equal if all the fields match
      if (this.id == l.getId()
              && this.counter == l.getCounter()
              && this.hostName.equals(l.getHostName())
              && this.timeStamp == l.getTimeStamp()) {
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
    hash = hash * 31 + (new Long(timeStamp)).hashCode();
    return hash;
  }

  @Override
  public String toString() {
    return this.id + ", " + hostName + ", " + counter + ", " + timeStamp;
  }

  public static class HopsYarnLeader extends HopsLeader {

    public enum Finder implements LeaderFinder<HopsYarnLeader> {
      ById, All;

      @Override
      public Class getType() {
        return HopsYarnLeader.class;
      }

      @Override
      public Annotation getAnnotated() {
        switch (this){
          case ById: return Annotation.PrimaryKey;
          case All: return Annotation.FullTable;
          default: throw new IllegalStateException();
        }
      }
    }

    public HopsYarnLeader(long id, long counter, long timeStamp,
        String hostName, String httpAddress, int partitionVal) {
      super(id, counter, timeStamp, hostName, httpAddress, partitionVal);
    }

    public HopsYarnLeader(long id, long counter, long timeStamp,
        String hostName, String httpAddress) {
      super(id, counter, timeStamp, hostName, httpAddress);
    }
  }

  public static class HopsHdfsLeader extends HopsLeader {

    public enum Finder implements LeaderFinder<HopsHdfsLeader> {
      ById, All;

      @Override
      public Class getType() {
        return HopsHdfsLeader.class;
      }

      @Override
      public Annotation getAnnotated() {
        switch (this){
          case ById: return Annotation.PrimaryKey;
          case All: return Annotation.FullTable;
          default: throw new IllegalStateException();
        }
      }
    }

    public HopsHdfsLeader(long id, long counter, long timeStamp,
        String hostName, String httpAddress, int partitionVal) {
      super(id, counter, timeStamp, hostName, httpAddress, partitionVal);
    }

    public HopsHdfsLeader(long id, long counter, long timeStamp,
        String hostName, String httpAddress) {
      super(id, counter, timeStamp, hostName, httpAddress);
    }
  }
}
