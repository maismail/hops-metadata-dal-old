package io.hops.metadata.hdfs.dal;

import java.util.Collection;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.common.entity.Variable;

public interface VariableDataAccess<T, Finder> extends EntityDataAccess {

  T getVariable(Finder varType) throws StorageException;
  
  void setVariable(Variable var) throws StorageException;
  
  void prepare(Collection<T> newVariables, Collection<T> updatedVariables,  Collection<T> removedVariables) throws StorageException;
}
