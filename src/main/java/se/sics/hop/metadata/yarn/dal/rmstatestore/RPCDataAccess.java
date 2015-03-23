package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 * @param <T>
 */
public interface RPCDataAccess<T> extends EntityDataAccess {

    /**
   * Retrieves an rpc by its type and userid.
   * @param type
   * @param userid
   * @return
   * @throws StorageException 
   */
  boolean findByTypeAndUserId(String type, String userid) throws StorageException;

  List<T> getAll() throws StorageException;

  void add(T toAdd) throws StorageException;

  void remove(T toRemove) throws StorageException;
}
