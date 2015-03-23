
package io.hops.metadata.yarn.entity.rmstatestore;

public class HopSecretMamagerKey {

  private final String keyId;
  private final byte[] key;

  public HopSecretMamagerKey(String keyType, byte[] key) {
    this.keyId = keyType;
    this.key = key;
  }

  public String getKeyType() {
    return keyId;
  }

  public byte[] getKey() {
    return key;
  }
  
  
}
