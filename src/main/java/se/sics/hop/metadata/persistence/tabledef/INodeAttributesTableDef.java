package se.sics.hop.metadata.persistence.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface INodeAttributesTableDef {

  public static final String TABLE_NAME = "inode_attributes";
  public static final String ID = "inodeId";
  public static final String NSQUOTA = "nsquota";
  public static final String DSQUOTA = "dsquota";
  public static final String NSCOUNT = "nscount";
  public static final String DISKSPACE = "diskspace";
}
