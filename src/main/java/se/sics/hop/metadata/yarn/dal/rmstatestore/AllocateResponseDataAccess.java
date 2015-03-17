package se.sics.hop.metadata.yarn.dal.rmstatestore;


import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

public interface AllocateResponseDataAccess<T> extends EntityDataAccess {
  void addAllocateResponse(T entry) throws StorageException;
  List<T> getAll() throws StorageException;
}
