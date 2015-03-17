package se.sics.hop.metadata.hdfs.tabledef;

public interface LeasePathTableDef {

  public static final String TABLE_NAME = "lease_paths";
  public static final String PART_KEY = "part_key";
  public static final String HOLDER_ID = "holder_id";
  public static final String PATH = "path";
  public static final int PART_KEY_VAL = 0;
}
