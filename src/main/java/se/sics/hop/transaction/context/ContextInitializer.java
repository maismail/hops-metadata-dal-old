package se.sics.hop.transaction.context;

import java.util.Map;
import se.sics.hop.StorageConnector;
import se.sics.hop.transaction.context.EntityContext;

public interface ContextInitializer {

  public Map<Class, EntityContext> createEntityContexts();

  public StorageConnector getConnector();
}
