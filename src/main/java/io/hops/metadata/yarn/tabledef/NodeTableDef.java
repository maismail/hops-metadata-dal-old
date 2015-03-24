package io.hops.metadata.yarn.tabledef;

/**
 * Defines table structure for hayarn_node table.
 */
public interface NodeTableDef {
  public static final String TABLE_NAME = "ha_node";
  public static final String NODEID = "nodeid";
  public static final String NAME = "name";
  public static final String LOCATION = "location";
  public static final String LEVEL = "level";
  public static final String PARENT = "parent";
}
