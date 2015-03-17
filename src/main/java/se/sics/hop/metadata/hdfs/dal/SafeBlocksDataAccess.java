package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;

public interface SafeBlocksDataAccess  extends EntityDataAccess {
  
  void insert(Collection<Long> safeBlocks) throws StorageException;
  void remove(Long safeBlock) throws StorageException;
  int countAll() throws StorageException;
  void removeAll() throws StorageException;
}
