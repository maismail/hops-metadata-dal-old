package io.hops.metadata.yarn.tabledef;

public interface ContainerStatusTableDef {

  public static final String TABLE_NAME = "ha_containerstatus";
  public static final String CONTAINERID = "containerid";
  public static final String STATE = "state";
  public static final String DIAGNOSTICS = "diagnostics";
  public static final String EXIT_STATUS = "exitstatus";
  public static final String RMNODEID = "rmnodeid";
  //State values
  public static final String STATE_RUNNING = "RUNNING";
  public static final String STATE_COMPLETED = "COMPLETE";
}
