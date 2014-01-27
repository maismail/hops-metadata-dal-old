package se.sics.hop.metadata.entity.hop.var;

import java.nio.ByteBuffer;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopLongVariable extends HopVariable {

  private Long value;

  public HopLongVariable(Finder type, long value) {
    this(type);
    this.value = value;
  }

  public HopLongVariable(Finder type) {
    super(type);
  }

  public HopLongVariable(long value) {
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
}
