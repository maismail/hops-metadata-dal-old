package se.sics.hop.metadata.hdfs.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface ExcessReplicaTableDef {

  public static final String TABLE_NAME = "excess_replicas";
  public static final String BLOCK_ID = "block_id";
  public static final String INODE_ID = "inode_id";
  public static final String PART_KEY = "part_key";
  public static final String STORAGE_ID = "storage_id";
  public static final String STORAGE_IDX = "storage_idx";
}
