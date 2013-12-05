package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.entity.hop.HopCorruptReplica;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 */
public abstract class CorruptReplicaDataAccess extends EntityDataAccess {

  public static final String TABLE_NAME = "corrupt_replicas";
  public static final String BLOCK_ID = "block_id";
  public static final String STORAGE_ID = "storage_id";

  public abstract int countAll() throws StorageException;

  public abstract int countAllUniqueBlk() throws StorageException;

  public abstract HopCorruptReplica findByPk(long blockId, String storageId) throws StorageException;

  public abstract List<HopCorruptReplica> findAll() throws StorageException;

  public abstract List<HopCorruptReplica> findByBlockId(long blockId) throws StorageException;

  public abstract void prepare(Collection<HopCorruptReplica> removed, Collection<HopCorruptReplica> newed, Collection<HopCorruptReplica> modified) throws StorageException;
}
