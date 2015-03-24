package io.hops.metadata.yarn.tabledef;

public interface AppSchedulingInfoTableDef {
  public static final String TABLE_NAME = "ha_appschedulinginfo";
  public static final String SCHEDULERAPP_ID = "applicationattemptid";
  public static final String APPID = "appid";
  public static final String QUEUENAME = "queuename";
  public static final String USER = "user";
  public static final String CONTAINERIDCOUNTER = "containeridcounter";
  public static final String PENDING = "pending";
  public static final String STOPED = "stoped";
}
