package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.entity.hdfs.HopBlockInfo;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 */
public abstract class BlockInfoDataAccess extends EntityDataAccess {
  /**
   * block info table info
   */
  public static final String TABLE_NAME = "block_infos";
  public static final String BLOCK_ID = "block_id";
  public static final String BLOCK_INDEX = "block_index";
  public static final String INODE_ID = "inode_id";
  public static final String NUM_BYTES = "num_bytes";
  public static final String GENERATION_STAMP = "generation_stamp";
  public static final String BLOCK_UNDER_CONSTRUCTION_STATE = "block_under_construction_state";
  public static final String TIME_STAMP = "time_stamp";
  public static final String PRIMARY_NODE_INDEX = "primary_node_index";
  public static final String BLOCK_RECOVERY_ID = "block_recovery_id";

  public abstract int countAll() throws StorageException;
  
  public abstract HopBlockInfo findById(long blockId) throws StorageException;

  public abstract List<HopBlockInfo> findByInodeId(long id) throws StorageException;

  public abstract List<HopBlockInfo> findAllBlocks() throws StorageException;

  public abstract List<HopBlockInfo> findByStorageId(String storageId) throws StorageException;
  
  public abstract void prepare(Collection<HopBlockInfo> removed, Collection<HopBlockInfo> newed, Collection<HopBlockInfo> modified) throws StorageException;

}
