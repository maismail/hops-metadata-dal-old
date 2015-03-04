package se.sics.hop.metadata.hdfs.tabledef;

/**
 * @author Mahmoud Ismail <maism@sics.se>
 * @author salman <salman@sics.se>
 */
public interface INodeTableDef {
  // INode Table Columns
  public static final String TABLE_NAME = "inodes";
  public static final String ID = "id";
  public static final String NAME = "name";
  public static final String PARENT_ID = "parent_id";
  public static final String MODIFICATION_TIME = "modification_time";
  public static final String ACCESS_TIME = "access_time";
  public static final String PERMISSION = "permission";
  public static final String CLIENT_NAME = "client_name";
  public static final String CLIENT_MACHINE = "client_machine";
  public static final String CLIENT_NODE = "client_node";
  public static final String GENERATION_STAMP = "generation_stamp";
  public static final String HEADER = "header";
  public static final String SYMLINK = "symlink";
  public static final String QUOTA_ENABLED = "quota_enabled";
  public static final String UNDER_CONSTRUCTION = "under_construction";
  public static final String SUBTREE_LOCKED = "subtree_locked";
  public static final String SUBTREE_LOCK_OWNER = "subtree_lock_owner";
}
