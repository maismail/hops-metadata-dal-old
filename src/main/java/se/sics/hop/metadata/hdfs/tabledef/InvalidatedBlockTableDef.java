package se.sics.hop.metadata.hdfs.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface InvalidatedBlockTableDef {

  public static final String TABLE_NAME = "invalidated_blocks";
  public static final String BLOCK_ID = "block_id";
  public static final String STORAGE_ID = "storage_id";
  public static final String STORAGE_IDX = "storage_idx";
  public static final String INODE_ID = "inode_id";
  public static final String GENERATION_STAMP = "generation_stamp";
  public static final String NUM_BYTES = "num_bytes";
}
