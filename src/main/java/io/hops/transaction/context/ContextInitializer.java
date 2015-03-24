package io.hops.transaction.context;

import io.hops.StorageConnector;

import java.util.Map;

public interface ContextInitializer {

  public Map<Class, EntityContext> createEntityContexts();

  public StorageConnector getConnector();
}
