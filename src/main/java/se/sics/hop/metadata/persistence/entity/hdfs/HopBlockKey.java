package se.sics.hop.metadata.persistence.entity.hdfs;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopBlockKey {

  private int keyId;
  private long expiryDate;
  private byte[] keyBytes;
  private short keyType;

  public HopBlockKey(int keyId, long expiryDate, byte[] keyBytes, short keyType) {
    this.keyId = keyId;
    this.expiryDate = expiryDate;
    this.keyBytes = keyBytes;
    this.keyType = keyType;
  }

  public int getKeyId() {
    return keyId;
  }

  public void setKeyId(int keyId) {
    this.keyId = keyId;
  }

  public long getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(long expiryDate) {
    this.expiryDate = expiryDate;
  }

  public byte[] getKeyBytes() {
    return keyBytes;
  }

  public void setKeyBytes(byte[] keyBytes) {
    this.keyBytes = keyBytes;
  }

  public short getKeyType() {
    return keyType;
  }

  public void setKeyType(short keyType) {
    this.keyType = keyType;
  }
}
