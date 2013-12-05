package se.sics.hop.metadata.persistence.entity.hop;

import se.sics.hop.metadata.persistence.FinderType;
import java.util.EnumMap;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopVariable {

  public final static EnumMap<Finder, Long> defaultValues = new EnumMap(Finder.class);

  public static void registerVariableDefaultValue(Finder variable, long defaultValue) {
    defaultValues.put(variable, defaultValue);
  }

  public static enum Finder implements FinderType<HopVariable> {

    GenerationStamp,
    BlockID;
    
    public int getId() {
      return this.ordinal();
    }

    public long getDefaultValue() {
      return defaultValues.get(this);
    }

    @Override
    public Class getType() {
      return HopVariable.class;
    }
  }
  private final Finder type;
  private long value;

  public HopVariable(Finder type, long value) {
    this.type = type;
    this.value = value;
  }

  public HopVariable(Finder type) {
    this(type, 0);
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public long getValue() {
    return value;
  }

  public Finder getType() {
    return type;
  }
}
