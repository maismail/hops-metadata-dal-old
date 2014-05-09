package se.sics.hop.metadata.hdfs.tabledef;

public interface EncodingStatusTableDef {
  public static final String TABLE_NAME = "encoding_status";

  // Erasure coding table columns
  public static final String INODE_ID = "inode_id";
  public static final String STATUS = "status";
  public static final String CODEC = "codec";
  public static final String TARGET_REPLICATION = "target_replication";
  public static final String MODIFICATION_TIME = "modification_time";
}
