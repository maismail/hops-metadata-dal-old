package se.sics.hop.metadata.persistence.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface VariableTableDef {

  public static final String TABLE_NAME = "variables";
  public static final String ID = "id";
  public static final String VARIABLE_VALUE = "value";
  public static final Integer MAX_VARIABLE_SIZE = 500;
}
