package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.entity.hdfs.HopReplicaUnderConstruction;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh
 */
public abstract class ReplicaUnderConstructionDataAccess extends EntityDataAccess {

  public static final String TABLE_NAME = "replica_under_constructions";
  public static final String BLOCK_ID = "block_id";
  public static final String STORAGE_ID = "storage_id";
  public static final String STATE = "state";
  public static final String REPLICA_INDEX = "replica_index";

  public abstract List<HopReplicaUnderConstruction> findReplicaUnderConstructionByBlockId(long blockId) throws StorageException;

  public abstract void prepare(Collection<HopReplicaUnderConstruction> removed, Collection<HopReplicaUnderConstruction> newed, Collection<HopReplicaUnderConstruction> modified) throws StorageException;
}
