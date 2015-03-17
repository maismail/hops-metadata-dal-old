/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore;

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
