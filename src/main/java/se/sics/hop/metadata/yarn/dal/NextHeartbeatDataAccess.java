package se.sics.hop.metadata.yarn.dal;

import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * DataAccess Interface for the table storing the RMNode.nextheartbeat field.
 * <p>
 * @author Theofilos Kakantousis <tkak@sics.se>
 * @param <T>
 */
public interface NextHeartbeatDataAccess<T> extends EntityDataAccess {

  /**
   *
   * @param rmnodeId
   * @return
   * @throws StorageException
   */
  boolean findEntry(String rmnodeId) throws StorageException;

  /**
   *
   * @param rmnodeid
   * @param nextHeartbeat
   * @throws StorageException
   */
  void updateNextHeartbeat(String rmnodeid, boolean nextHeartbeat) throws
          StorageException;

  Map<String, Boolean> getAll() throws StorageException;

}
