package io.hops.metadata.yarn.tabledef;

/**
 *
 * Defines table structure for SchedulerEvents persisted by the
 * Distributed ResourceTrackerService.
 */
public interface PendingEventTableDef {

  public static final String TABLE_NAME = "ha_pendingevents";
  public static final String RMNODEID = "rmnodeid";
  public static final String TYPE = "type";
  public static final String STATUS = "status";
  public static final String ID = "id";

  //Event Type
  public static final byte NODE_ADDED = 1;
  public static final byte NODE_REMOVED = 2;
  public static final byte NODE_UPDATED = 3;

  //Event status
  public static final byte NEW = 1;
  public static final byte PENDING = 2;
  public static final byte COMPLETED = 3;

  //Event transactionstate action
  public static final int PERSISTEDEVENT_ADD = 1;
  public static final int PERSISTEDEVENT_REMOVE = 2;
}
