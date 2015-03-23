
package io.hops.metadata.hdfs.entity.yarn;

public class HopLoad {
  private final String rmHostName;
  private final long load;

  public HopLoad(String rmId, long load) {
    this.rmHostName = rmId;
    this.load = load;
  }

  public String getRmHostName() {
    return rmHostName;
  }

  public long getLoad() {
    return load;
  }
  
  
}
