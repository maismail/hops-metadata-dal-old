package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.entity.hdfs.HopBlockKey;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author Hooman <hooman@sics.se>
 */
public abstract class BlockTokenKeyDataAccess extends EntityDataAccess {

  /**
   * delegation key table info
   */
  public static final String TABLE_NAME = "block_token_keys";
  public static final String KEY_ID = "key_id";
  public static final String EXPIRY_DATE = "expiry_date";
  public static final String KEY_BYTES = "key_bytes";
  public static final String KEY_TYPE = "key_type";
  
  public abstract HopBlockKey findByKeyId(int keyId) throws StorageException;
  public abstract HopBlockKey findByKeyType(short keyType) throws StorageException;
  public abstract List<HopBlockKey> findAll() throws StorageException;
  public abstract void prepare(Collection<HopBlockKey> removed, Collection<HopBlockKey> newed, Collection<HopBlockKey> modified) throws StorageException;
  public abstract void removeAll() throws StorageException;
}
