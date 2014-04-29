package se.sics.hop.metadata.hdfs.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface PendingBlockTableDef {

  public static final String TABLE_NAME = "pending_blocks";
  public static final String BLOCK_ID = "block_id";
  public static final String INODE_ID = "inode_id";
  public static final String PART_KEY = "part_key";
  public static final String TIME_STAMP = "time_stamp";
  public static final String NUM_REPLICAS_IN_PROGRESS = "num_replicas_in_progress";
}
