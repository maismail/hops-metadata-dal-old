package io.hops.metadata.yarn.entity;

public class Load {
  private final String rmHostName;
  private final long load;

  public Load(String rmId, long load) {
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
