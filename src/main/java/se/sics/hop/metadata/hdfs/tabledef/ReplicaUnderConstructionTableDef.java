package se.sics.hop.metadata.hdfs.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface ReplicaUnderConstructionTableDef {

  public static final String TABLE_NAME = "replica_under_constructions";
  public static final String BLOCK_ID = "block_id";
  public static final String STORAGE_ID = "storage_id";
    public static final String INODE_ID = "inode_id";
  public static final String PART_KEY = "part_key";
  public static final String STATE = "state";
  public static final String REPLICA_INDEX = "replica_index";
}
