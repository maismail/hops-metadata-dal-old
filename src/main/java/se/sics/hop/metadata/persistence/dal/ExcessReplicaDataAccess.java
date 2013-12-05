package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.entity.hop.HopExcessReplica;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 */
public abstract class ExcessReplicaDataAccess extends EntityDataAccess {

  public static final String TABLE_NAME = "excess_replicas";
  public static final String BLOCK_ID = "block_id";
  public static final String STORAGE_ID = "storage_id";

  public abstract int countAll() throws StorageException;

  public abstract List<HopExcessReplica> findExcessReplicaByStorageId(String sId) throws StorageException;
  public abstract List<HopExcessReplica> findExcessReplicaByBlockId(long bId) throws StorageException;

  public abstract HopExcessReplica findByPkey(Object[] params) throws StorageException;
  
  public abstract void prepare(Collection<HopExcessReplica> removed, Collection<HopExcessReplica> newed, Collection<HopExcessReplica> modified) throws StorageException;
  
  public abstract void removeAll() throws StorageException;
}
