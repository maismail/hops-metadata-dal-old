package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.entity.HopIndexedReplica;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 */
public abstract class ReplicaDataAccess extends EntityDataAccess {

  public static final String TABLE_NAME = "replicas";
  public static final String BLOCK_ID = "block_id";
  public static final String STORAGE_ID = "storage_id";
  public static final String REPLICA_INDEX = "replica_index";

  public abstract List<HopIndexedReplica> findReplicasById(long id) throws StorageException;

  public abstract void prepare(Collection<HopIndexedReplica> removed, Collection<HopIndexedReplica> newed, Collection<HopIndexedReplica> modified) throws StorageException;
}