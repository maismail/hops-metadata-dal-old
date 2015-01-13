package se.sics.hop.transaction;

import se.sics.hop.exception.StorageException;
import se.sics.hop.exception.TransactionContextException;
import se.sics.hop.metadata.hdfs.entity.CounterType;
import se.sics.hop.transaction.context.ContextInitializer;
import se.sics.hop.transaction.context.EntityContext;
import se.sics.hop.transaction.context.EntityContextStat;
import se.sics.hop.metadata.hdfs.entity.FinderType;
import se.sics.hop.transaction.context.TransactionContext;
import se.sics.hop.transaction.context.TransactionContextMaintenanceCmds;
import se.sics.hop.transaction.handler.RequestHandler;
import se.sics.hop.transaction.lock.TransactionLocks;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 */
public class EntityManager {

  private EntityManager() {
  }
  //private static ThreadLocal<TransactionContext> contexts = new ThreadLocal<TransactionContext>();
  private static ConcurrentHashMap<Long, TransactionContext> contexts = new ConcurrentHashMap<Long, TransactionContext>();
  private static ContextInitializer contextInitializer;

  public static void setContextInitializer(ContextInitializer ci) {
    contextInitializer = ci;
    RequestHandler.setStorageConnector(contextInitializer.getConnector());
  }
  
  private static TransactionContext context() {
    Long threadID = getThreadID();
    TransactionContext context = contexts.get(threadID);
    if (context == null) {
      context = addContext();
    }
    return context;
  }

  public static void begin() throws StorageException {
    context().begin();
  }

  public static void preventStorageCall(boolean val) {
    context().preventStorageCall(val);
  }

  public static void commit(TransactionLocks tlm)
      throws TransactionContextException, StorageException {
    context().commit(tlm);
    removeContext();
  }

  public static void rollback(TransactionLocks tlm)
      throws StorageException, TransactionContextException {
    context().rollback();
    removeContext();
  }

  public static <T> void remove(T obj)
      throws StorageException, TransactionContextException {
    context().remove(obj);
  }

  public static void removeAll(Class type)
      throws StorageException, TransactionContextException {
    context().removeAll(type);
  }

  public static <T> Collection<T> findList(FinderType<T> finder, Object... params)
      throws TransactionContextException, StorageException {
    return context().findList(finder, params);
  }

  public static <T> T find(FinderType<T> finder, Object... params)
      throws TransactionContextException, StorageException {
    return context().find(finder, params);
  }

  public static int count(CounterType counter, Object... params)
      throws TransactionContextException, StorageException {
    return context().count(counter, params);
  }

  public static <T> void update(T entity)
      throws TransactionContextException, StorageException {
    context().update(entity);
  }

  public static <T> void add(T entity)
      throws TransactionContextException, StorageException {
    context().add(entity);
  }
  
  public static <T> void snapshotMaintenance(TransactionContextMaintenanceCmds cmds, Object... params)
      throws TransactionContextException {
    context().snapshotMaintenance(cmds, params);
  }

  public static void writeLock() throws StorageException {
    EntityContext.setLockMode(EntityContext.LockMode.WRITE_LOCK);
    contextInitializer.getConnector().writeLock();
  }

  public static void readLock() throws StorageException {
    EntityContext.setLockMode(EntityContext.LockMode.READ_LOCK);
    contextInitializer.getConnector().readLock();
  }

  public static void readCommited() throws StorageException {
    EntityContext.setLockMode(EntityContext.LockMode.READ_COMMITTED);
    contextInitializer.getConnector().readCommitted();
  }

  public static void setPartitionKey(Class name, Object key) throws StorageException {
    contextInitializer.getConnector().setPartitionKey(name, key);
  }
  
  public static Collection<EntityContextStat> collectSnapshotStat()
      throws TransactionContextException {
    return context().collectSnapshotStat();
  }
  
  private static Long getThreadID(){
    return Thread.currentThread().getId();
  }
  
  private static TransactionContext addContext(){
    Long threadID = getThreadID();
    Map<Class, EntityContext> storageMap = contextInitializer.createEntityContexts();
    TransactionContext context = new TransactionContext(contextInitializer.getConnector(), storageMap);
    contexts.put(threadID,context);
    return context;
  }
  
  private static void removeContext(){
    Long threadID = getThreadID();
    contexts.remove(threadID);
  }
}
