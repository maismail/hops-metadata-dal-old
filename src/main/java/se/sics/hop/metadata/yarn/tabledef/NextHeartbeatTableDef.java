package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * Defines table structure for SchedulerEvents persisted by the
 * Distributed ResourceTrackerService.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface NextHeartbeatTableDef {

  public static final String TABLE_NAME = "ha_nextheartbeat";
  public static final String RMNODEID = "rmnodeid";
  public static final String NEXTHEARTBEAT = "nextheartbeat";
  
  //Field that denotes the integer value of the nextheartbeat field if is true
  public static final int NEXTHEARTBEAT_TRUE = 1;
  public static final int NEXTHEARTBEAT_FALSE = 0;
}
