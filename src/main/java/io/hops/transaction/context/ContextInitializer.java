package io.hops.transaction.context;

import java.util.Map;
import io.hops.StorageConnector;

public interface ContextInitializer {

  public Map<Class, EntityContext> createEntityContexts();

  public StorageConnector getConnector();
}
