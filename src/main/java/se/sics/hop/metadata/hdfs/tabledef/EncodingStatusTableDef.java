package se.sics.hop.metadata.hdfs.tabledef;

public interface EncodingStatusTableDef {
  public static final String TABLE_NAME = "encoding_status";

  // Erasure coding table columns
  public static final String INODE_ID = "inode_id";
  public static final String PARITY_INODE_ID = "parity_inode_id";
  public static final String STATUS = "status";
  public static final String PARITY_STATUS = "parity_status";
  public static final String CODEC = "codec";
  public static final String TARGET_REPLICATION = "target_replication";
  public static final String STATUS_MODIFICATION_TIME = "status_modification_time";
  public static final String PARITY_STATUS_MODIFICATION_TIME = "parity_status_modification_time";
  public static final String PARITY_FILE_NAME = "parity_file_name";
  public static final String LOST_BLOCKS = "lost_blocks";
  public static final String LOST_PARITY_BLOCKS = "lost_parity_blocks";
  public static final String LOST_BLOCK_SUM = "lost_block_sum";
}
