package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.entity.hop.HopInvalidatedBlock;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 */
public abstract class InvalidateBlockDataAccess extends EntityDataAccess{

  public static final String TABLE_NAME = "invalidated_blocks";
  public static final String BLOCK_ID = "block_id";
  public static final String STORAGE_ID = "storage_id";
  public static final String GENERATION_STAMP = "generation_stamp";
  public static final String NUM_BYTES = "num_bytes";

  public abstract int countAll() throws StorageException;

  public abstract Collection<HopInvalidatedBlock> findInvalidatedBlockByStorageId(String storageId) throws StorageException;
  
  public abstract Collection<HopInvalidatedBlock> findInvalidatedBlocksByBlockId(long bid) throws StorageException;

  public abstract Collection<HopInvalidatedBlock> findAllInvalidatedBlocks() throws StorageException;

  public abstract HopInvalidatedBlock findInvBlockByPkey(Object[] params) throws StorageException;

  public abstract void prepare(Collection<HopInvalidatedBlock> removed, Collection<HopInvalidatedBlock> newed, Collection<HopInvalidatedBlock> modified) throws StorageException;
  
  public abstract void removeAll() throws StorageException;
  
  public abstract void remove(HopInvalidatedBlock invBlk);
}
