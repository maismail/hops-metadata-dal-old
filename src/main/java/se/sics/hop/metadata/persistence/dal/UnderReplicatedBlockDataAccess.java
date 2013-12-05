package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.entity.hop.HopUnderReplicatedBlock;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 */
public abstract class UnderReplicatedBlockDataAccess extends EntityDataAccess {

  public static final String TABLE_NAME = "under_replicated_blocks";
  public static final String BLOCK_ID = "block_id";
  public static final String LEVEL = "level";

  public abstract HopUnderReplicatedBlock findByBlockId(long blockId) throws StorageException;

  public abstract List<HopUnderReplicatedBlock> findAll() throws StorageException;

  public abstract List<HopUnderReplicatedBlock> findByLevel(int level) throws StorageException;

  public abstract List<HopUnderReplicatedBlock> findAllLessThanLevel(int level) throws StorageException;

  public abstract void prepare(Collection<HopUnderReplicatedBlock> removed, Collection<HopUnderReplicatedBlock> newed, Collection<HopUnderReplicatedBlock> modified) throws StorageException;

  public abstract void removeAll() throws StorageException;

  public abstract int countAll() throws StorageException;
  
  public abstract int countByLevel(int level) throws StorageException;
  
  public abstract int countLessThanALevel(int level) throws StorageException;

}
