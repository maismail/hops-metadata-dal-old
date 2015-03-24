package io.hops.metadata.yarn.entity.rmstatestore;

public class RMStateVersion {
  private final int id;
  private final byte[] version;

  public RMStateVersion(int id, byte[] version) {
    this.id = id;
    this.version = version;
  }

  public int getId() {
    return id;
  }

  public byte[] getVersion() {
    return version;
  }
}
