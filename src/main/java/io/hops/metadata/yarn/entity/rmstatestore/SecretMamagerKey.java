package io.hops.metadata.yarn.entity.rmstatestore;

public class SecretMamagerKey {

  private final String keyId;
  private final byte[] key;

  public SecretMamagerKey(String keyType, byte[] key) {
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
