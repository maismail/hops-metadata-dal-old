package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface VariableDataAccess<T, Finder> extends EntityDataAccess {

  T getVariable(Finder varType) throws StorageException;

  void prepare(Collection<T> updatedVariables) throws StorageException;
}
