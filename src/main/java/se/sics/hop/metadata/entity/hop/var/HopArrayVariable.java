package se.sics.hop.metadata.entity.hop.var;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopArrayVariable extends HopVariable {

  private List<HopVariable> vars;
  private int length;

  public HopArrayVariable(Finder type) {
    super(type);
    vars = new ArrayList<HopVariable>();
    length = 0;
  }

  public HopArrayVariable(Finder type, List<? extends Object> value) {
    this(type);
    initVariables(value);
  }

  public HopArrayVariable(List<? extends Object> value){
    this(Finder.GenericArray, value);
  }
  
  public void addVariable(HopVariable var) {
    length += var.getLength();
    vars.add(var);
  }

  @Override
  public List<HopVariable> getValue() {
    return vars;
  }

  public List<? extends Object> getVarsValue() {
    List<Object> vals = new ArrayList<Object>();
    for (HopVariable var : vars) {
      vals.add(var.getValue());
    }
    return vals;
  }

  @Override
  public void setValue(byte[] val) {
    if (val.length == 0) {
      return;
    }
    ByteBuffer varsData = ByteBuffer.wrap(val);
    while (varsData.hasRemaining()) {
      HopVariable var = getVariable(varsData.get());
      byte[] vdata;
      int off = 0;
      int len = var.getLength();
      if (len == -1) {
        len = varsData.get();
        off = 1;
        vdata = new byte[len + off];
        vdata[0] = (byte) len;
      } else {
        vdata = new byte[len];
      }
      varsData.get(vdata, off, len);
      var.setValue(vdata);
      vars.add(var);
    }
  }

  @Override
  public byte[] getBytes() {
    ByteBuffer varsData = ByteBuffer.allocate(getLength());
    for (HopVariable var : vars) {
      varsData.put((byte) var.getType().getId());
      varsData.put(var.getBytes());
    }
    return varsData.array();
  }

  @Override
  public int getLength() {
    return length + vars.size();
  }

  private void initVariables(List<? extends Object> arrItems) {
    for (Object item : arrItems) {
      Class itemClass = item.getClass();
      if (itemClass == Integer.class) {
        addVariable(new HopIntVariable((Integer) item));
      } else if (itemClass == Long.class) {
        addVariable(new HopLongVariable((Long) item));
      } else if (itemClass == String.class) {
        addVariable(new HopStringVariable((String) item));
      } else {
        if (item instanceof byte[]) {
          addVariable(new HopByteArrayVariable((byte[]) item));
        } else {
          throw new IllegalArgumentException("Variable Type " + itemClass + " is not supported");
        }
      }
    }
  }
}
