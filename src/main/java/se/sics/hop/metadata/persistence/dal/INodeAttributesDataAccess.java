package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author salman
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface INodeAttributesDataAccess<T> extends EntityDataAccess {

  T findAttributesByPk(long inodeId) throws StorageException;

  void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
