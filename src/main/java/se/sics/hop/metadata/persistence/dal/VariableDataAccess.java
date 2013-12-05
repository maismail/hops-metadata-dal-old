
package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.entity.hop.HopVariable;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class VariableDataAccess extends EntityDataAccess{
  
  public static final String TABLE_NAME = "variables";
  public static final String ID = "id";
  public static final String VARIABLE_VALUE = "value";
  
  public abstract HopVariable getVariable(HopVariable.Finder varType) throws StorageException;
  public abstract void prepare(Collection<HopVariable> updatedVariables) throws StorageException;
  
}
