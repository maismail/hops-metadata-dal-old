package io.hops.metadata.hdfs.tabledef;

public interface BlockChecksumTableDef {
  public static final String TABLE_NAME = "block_checksum";

  public static final String INODE_ID = "inode_id";
  public static final String BLOCK_INDEX = "block_index";
  public static final String CHECKSUM = "checksum";
}
