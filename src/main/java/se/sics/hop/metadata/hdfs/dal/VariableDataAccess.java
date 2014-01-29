package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface VariableDataAccess<T, Finder> extends EntityDataAccess {

  T getVariable(Finder varType) throws StorageException;

  void prepare(Collection<T> newVariables, Collection<T> updatedVariables,  Collection<T> removedVariables) throws StorageException;
}
