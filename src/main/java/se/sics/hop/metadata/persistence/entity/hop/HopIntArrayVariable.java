package se.sics.hop.metadata.persistence.entity.hop;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopIntArrayVariable extends HopVariable {

  public static void registerVariableDefaultValue(Finder variable, List<Integer> defaultValue) {
    registerVariableDefaultValue(variable, intList2byteArray(defaultValue));
  }

  public HopIntArrayVariable(Finder var, List<Integer> value) {
    super(var, null);
    setValue(intList2byteArray(value));
  }

  public HopIntArrayVariable(HopVariable var) {
    super(var.getType(), var.getValue());
  }

  public List<Integer> getIntListValue() {
    return byteArray2IntList(getValue());
  }

  private static byte[] intList2byteArray(List<Integer> intarr) {
    ByteBuffer buffer = ByteBuffer.allocate(intarr.size() * 4);
    for (Integer v : intarr) {
      buffer.putInt(v);
    }
    return buffer.array();
  }

  private static List<Integer> byteArray2IntList(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.wrap(arr);
    List<Integer> intArr = new ArrayList<Integer>();
    while (buffer.hasRemaining()) {
      intArr.add(buffer.getInt());
    }
    return intArr;
  }

  @Override
  public String toString() {
    return byteArray2IntList(getValue()).toString();
  }
}
