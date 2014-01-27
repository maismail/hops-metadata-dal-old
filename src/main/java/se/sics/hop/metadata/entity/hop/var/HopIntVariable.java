package se.sics.hop.metadata.entity.hop.var;

import java.nio.ByteBuffer;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopIntVariable extends HopVariable {

  private Integer value;

  public HopIntVariable(Finder type, int value) {
    this(type);
    this.value = value;
  }

  public HopIntVariable(Finder type) {
    super(type);
  }

  public HopIntVariable(int value) {
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
}
