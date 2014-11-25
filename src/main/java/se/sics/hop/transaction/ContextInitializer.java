package se.sics.hop.transaction;

import java.util.Map;
import se.sics.hop.StorageConnector;
import se.sics.hop.metadata.hdfs.entity.EntityContext;
import se.sics.hop.transaction.lock.TransactionLockAcquirer;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface ContextInitializer {

  public Map<Class, EntityContext> createEntityContexts();

  public StorageConnector getConnector();
}
