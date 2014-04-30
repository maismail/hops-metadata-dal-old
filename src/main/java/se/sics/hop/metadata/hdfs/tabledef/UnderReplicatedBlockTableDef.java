package se.sics.hop.metadata.hdfs.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface UnderReplicatedBlockTableDef {

  public static final String TABLE_NAME = "under_replicated_blocks";
  public static final String BLOCK_ID = "block_id";
  public static final String INODE_ID = "inode_id";
  public static final String PART_KEY = "part_key";
  public static final String LEVEL = "level";
}
