package se.sics.hop.metadata.persistence.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface StorageInfoTableDef {

  public static final String TABLE_NAME = "storage_info";
  public static final String ID = "id";
  public static final String LAYOUT_VERSION = "layout_version";
  public static final String NAMESPACE_ID = "namespace_id";
  public static final String CLUSTER_ID = "cluster_id";
  public static final String CREATION_TIME = "creation_time";
  public static final String BLOCK_POOL_ID = "block_pool_id";
}
