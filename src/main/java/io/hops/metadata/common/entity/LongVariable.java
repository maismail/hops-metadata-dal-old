package io.hops.metadata.common.entity;

import java.nio.ByteBuffer;

public class LongVariable extends Variable {

  private Long value;

  public LongVariable(Finder type, long value) {
    this(type);
    this.value = value;
  }

  public LongVariable(Finder type) {
    super(type);
  }

  public LongVariable(long value) {
    this(Finder.GenericLong, value);
  }

  @Override
  public Long getValue() {
    return value;
  }

  @Override
  public void setValue(byte[] val) {
    if (val.length != getLength()) {
      return;
    }
    ByteBuffer buf = ByteBuffer.wrap(val);
    value = buf.getLong();
  }

  @Override
  public byte[] getBytes() {
    ByteBuffer buf = ByteBuffer.allocate(getLength());
    buf.putLong(value);
    return buf.array();
  }

  @Override
  public int getLength() {
    return 8;
  }

  @Override
  public String toString() {
    return Long.toString(value);
  }
}
