package se.sics.hop.metadata.persistence.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface BlockTokenTableDef {

  public static final String TABLE_NAME = "block_token_keys";
  public static final String KEY_ID = "key_id";
  public static final String EXPIRY_DATE = "expiry_date";
  public static final String KEY_BYTES = "key_bytes";
  public static final String KEY_TYPE = "key_type";
}
