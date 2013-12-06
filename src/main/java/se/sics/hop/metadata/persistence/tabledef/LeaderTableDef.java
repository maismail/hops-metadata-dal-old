package se.sics.hop.metadata.persistence.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface LeaderTableDef {

  public static final String TABLE_NAME = "leader";
  public static final String ID = "id";
  public static final String COUNTER = "counter";
  public static final String TIMESTAMP = "timestamp";
  public static final String HOSTNAME = "hostname";
  public static final String AVG_REQUEST_PROCESSING_LATENCY = "avg_request_processing_latency";
  public static final String PARTITION_VAL = "partition_val";
}
