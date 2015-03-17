package se.sics.hop.metadata.hdfs.entity.hop.var;

import java.io.UnsupportedEncodingException;

public class HopStringVariable extends HopByteArrayVariable {

  private String value = null;

  public HopStringVariable(Finder type, String value) {
    this(type);
    if (value.length() > 255) {
      throw new IllegalArgumentException("string variables shouldn't exceed 255 bytes");
    }
    this.value = value;
  }

  public HopStringVariable(Finder type) {
    super(type);
  }

  public HopStringVariable(String value) {
    this(Finder.GenericString, value);
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public void setValue(byte[] val) {
    super.setValue(val);
    value = getString(super.getByteArrayValue());
  }

  @Override
  public byte[] getBytes() {
    byte[] s = getByteArray(value);
    super.setByteArrayValue(s);
    return super.getBytes();
  }

  @Override
  public int getLength() {
    if (value == null) {
      return -1;
    }
    return getByteArray(value).length + 1;
  }

  private static byte[] getByteArray(String val) {
    try {
      return val.getBytes("UTF-8");
    } catch (UnsupportedEncodingException ex) {
      throw new RuntimeException(ex);
    }
  }

  private static String getString(byte[] val) {
    try {
      return new String(val, "UTF-8");
    } catch (UnsupportedEncodingException ex) {
      throw new RuntimeException(ex);
    }
  }

  @Override
  public String toString() {
    return value; //To change body of generated methods, choose Tools | Templates.
  }
  
}
