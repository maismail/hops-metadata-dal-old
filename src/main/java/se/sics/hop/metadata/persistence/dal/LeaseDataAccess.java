package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.exceptions.StorageException;
import se.sics.hop.metadata.persistence.entity.HopLease;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 */
public abstract class LeaseDataAccess extends EntityDataAccess{

  public static final String TABLE_NAME = "leases";
  public static final String HOLDER = "holder";
  public static final String LAST_UPDATE = "last_update";
  public static final String HOLDER_ID = "holder_id";

  public abstract int countAll() throws StorageException;

  public abstract Collection<HopLease> findByTimeLimit(long timeLimit) throws StorageException;

  public abstract Collection<HopLease> findAll() throws StorageException;

  public abstract HopLease findByPKey(String holder) throws StorageException;

  public abstract HopLease findByHolderId(int holderId) throws StorageException;

  public abstract void prepare(Collection<HopLease> removed, Collection<HopLease> newLeases, Collection<HopLease> modified) throws StorageException;
  
  public abstract void removeAll() throws StorageException;
}
