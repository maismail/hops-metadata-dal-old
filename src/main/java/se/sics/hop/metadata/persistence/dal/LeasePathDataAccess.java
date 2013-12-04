package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.entity.HopLeasePath;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 */
public abstract class LeasePathDataAccess extends EntityDataAccess {

  public static final String TABLE_NAME = "lease_paths";
  public static final String HOLDER_ID = "holder_id";
  public static final String PATH = "path";

  public abstract Collection<HopLeasePath> findByHolderId(int holderId) throws StorageException;

  public abstract Collection<HopLeasePath> findByPrefix(String prefix) throws StorageException;

  public abstract Collection<HopLeasePath> findAll() throws StorageException;

  public abstract HopLeasePath findByPKey(String path) throws StorageException;

  public abstract void prepare(Collection<HopLeasePath> removed, Collection<HopLeasePath> newed, Collection<HopLeasePath> modified) throws StorageException;

  public abstract void removeAll() throws StorageException;
}
