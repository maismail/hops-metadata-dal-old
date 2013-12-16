package se.sics.hop.metadata.persistence.entity.hop;

import se.sics.hop.metadata.persistence.FinderType;
import java.util.EnumMap;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopVariable {

  public final static EnumMap<Finder, byte[]> defaultValues = new EnumMap(Finder.class);

  public static void registerVariableDefaultValue(Finder variable, byte[] defaultValue) {
    defaultValues.put(variable, defaultValue);
  }

  public static enum Finder implements FinderType<HopVariable> {

    GenerationStamp,
    BlockID,
    INodeID,
    ReplicationIndex;

    public int getId() {
      return this.ordinal();
    }

    public byte[] getDefaultValue() {
      return defaultValues.get(this);
    }

    @Override
    public Class getType() {
      return HopVariable.class;
    }
  }
  private final Finder type;
  private byte[] value;

  public HopVariable(Finder type, byte[] value) {
    this.type = type;
    this.value = value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }

  public byte[] getValue() {
    return value;
  }

  public Finder getType() {
    return type;
  }
}
