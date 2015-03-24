package io.hops.metadata.election;

public class TablesDef {
  public abstract static interface LeDescriptorTableDef {
    public static final String ID = "id";
    public static final String COUNTER = "counter";
    public static final String HOSTNAME = "hostname";
    public static final String HTTP_ADDRESS = "httpAddress";
    public static final String PARTITION_VAL = "partition_val";
  }

  public static interface HdfsLeaderTableDef extends LeDescriptorTableDef {
    public static String TABLE_NAME = "hdfs_le_descriptors";
  }

  public static interface YarnLeaderTableDef extends LeDescriptorTableDef {
    public static final String TABLE_NAME = "yarn_le_descriptors";
  }
}
