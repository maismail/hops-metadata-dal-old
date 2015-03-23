package io.hops.metadata.common.entity;

import java.nio.ByteBuffer;

public class ByteArrayVariable extends Variable {

  private byte[] value;

  public ByteArrayVariable(Finder type, byte[] value) {
    this(type);
    if (value.length > 255) {
      throw new IllegalArgumentException("byte array shouldn't exceed 255 bytes");
    }
    this.value = value;
  }

  public ByteArrayVariable(Finder type) {
    super(type);
  }

  public ByteArrayVariable(byte[] value) {
    this(Finder.GenericByteArray, value);
  }

  @Override
  public Object getValue() {
    return value;
  }

  @Override
  public void setValue(byte[] val) {
    if (val.length == 0) {
      return;
    }
    ByteBuffer buf = ByteBuffer.wrap(val);
    int len = buf.get();
    value = new byte[len];
    buf.get(value);
  }

  @Override
  public byte[] getBytes() {
    ByteBuffer buf = ByteBuffer.allocate(getLength());
    buf.put((byte) value.length);
    buf.put(value);
    return buf.array();
  }

  @Override
  public int getLength() {
    if (value == null) {
      return -1;
    }
    return value.length + 1;
  }

  protected void setByteArrayValue(byte[] val) {
    this.value = val;
  }

  protected byte[] getByteArrayValue() {
    return this.value;
  }
}
