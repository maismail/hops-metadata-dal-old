package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopUpdatedContainerInfo;

public interface UpdatedContainerInfoDataAccess<T> extends EntityDataAccess {

  Map<Integer, List<T>> findByRMNode(String rmnodeid) throws StorageException;

  Map<String, Map<Integer, List<HopUpdatedContainerInfo>>> getAll() throws
          StorageException;

  void addAll(Collection<T> containers) throws StorageException;

  void removeAll(Collection<T> containers) throws StorageException;

}
