package io.hops.metadata.common.entity;

import java.nio.ByteBuffer;

public class IntVariable extends Variable {

  private Integer value;

  public IntVariable(Finder type, int value) {
    this(type);
    this.value = value;
  }

  public IntVariable(Finder type) {
    super(type);
  }

  public IntVariable(int value) {
    this(Finder.GenericInteger, value);
  }

  @Override
  public Integer getValue() {
    return value;
  }

  @Override
  public void setValue(byte[] val) {
    if (val.length != getLength()) {
      return;
    }
    ByteBuffer buf = ByteBuffer.wrap(val);
    value = buf.getInt();
  }

  @Override
  public byte[] getBytes() {
    ByteBuffer buf = ByteBuffer.allocate(getLength());
    buf.putInt(value);
    return buf.array();
  }

  @Override
  public int getLength() {
    return 4;
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }
}
