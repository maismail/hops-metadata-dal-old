package io.hops.metadata.hdfs.tabledef;

public interface UnderReplicatedBlockTableDef {

  public static final String TABLE_NAME = "under_replicated_blocks";
  public static final String BLOCK_ID = "block_id";
  public static final String INODE_ID = "inode_id";
  public static final String LEVEL = "level";
  public static final String TIMESTAMP = "timestamp";
}
