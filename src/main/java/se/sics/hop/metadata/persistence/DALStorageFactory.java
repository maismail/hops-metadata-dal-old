package se.sics.hop.metadata.persistence;

import java.util.Properties;
import se.sics.hop.metadata.persistence.dal.EntityDataAccess;

/**
 * 
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface DALStorageFactory {

  public void setConfiguration(Properties conf);

  public StorageConnector getConnector();

  public EntityDataAccess getDataAccess(Class type);
}
