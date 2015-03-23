package io.hops.metadata.yarn.tabledef;

public interface RMContainerTableDef {

  public static final String TABLE_NAME = "ha_rmcontainer";
  public static final String CONTAINERID_ID = "containerid_id";
  public static final String APPLICATIONATTEMPTID_ID = "appattemptid_id";
  public static final String NODEID_ID = "nodeid_id";
  public static final String USER = "user";
//  public static final String RESERVED_NODEID_ID = "reservednodeid_id";
//  public static final String RESERVED_PRIORITY_ID = "reservedpriority_id";
  public static final String STARTTIME = "starttime";
  public static final String FINISHTIME = "finishtime";
  public static final String STATE = "state";
  public static final String FINISHEDSTATUSSTATE = "finishedstatusstate";
  public static final String EXITSTATUS = "exitstatus";
}
