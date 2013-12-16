package se.sics.hop.metadata.persistence.entity.hop;

import java.nio.ByteBuffer;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopLongVariable extends HopVariable {

  public static void registerVariableDefaultValue(Finder variable, long defaultValue) {
    registerVariableDefaultValue(variable, long2byteArray(defaultValue));
  }

  public HopLongVariable(Finder variable, long value) {
    super(variable, null);
    setValue(long2byteArray(value));
  }

  public HopLongVariable(HopVariable var) {
    super(var.getType(), var.getValue());
  }

  public long getLongValue() {
    return byteArray2long(getValue());
  }

  private static byte[] long2byteArray(long value) {
    ByteBuffer buffer = ByteBuffer.allocate(8);
    buffer.putLong(value);
    return buffer.array();
  }

  private static long byteArray2long(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.wrap(arr);
    return buffer.getLong();
  }

  @Override
  public String toString() {
    return String.valueOf(byteArray2long(getValue()));
  }
}
