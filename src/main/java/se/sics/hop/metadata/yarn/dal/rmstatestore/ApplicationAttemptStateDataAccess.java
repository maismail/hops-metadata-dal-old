package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore.HopApplicationAttemptState;

public interface ApplicationAttemptStateDataAccess<T> extends EntityDataAccess {
T findEntry(String applicationid, String applicationattemptid) throws StorageException;

  Map<String, List<HopApplicationAttemptState>> getAll() throws StorageException;

  void addAll(Collection<T> toAdd) throws StorageException;

  void removeAll(Collection<T> toRemove) throws StorageException;

  void createApplicationAttemptStateEntry(T entry) throws StorageException;
}
