package se.sics.hop.transaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.log4j.NDC;
import se.sics.hop.metadata.hdfs.entity.EntityContext;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.entity.CounterType;
import se.sics.hop.metadata.hdfs.entity.FinderType;
import se.sics.hop.exception.PersistanceException;
import se.sics.hop.metadata.hdfs.entity.EntityContextStat;
import se.sics.hop.metadata.hdfs.entity.TransactionContextMaintenanceCmds;
import se.sics.hop.transaction.lock.TransactionLocks;
import se.sics.hop.transaction.handler.RequestHandler;
import se.sics.hop.transaction.lock.ParallelReadThread;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 */
public class EntityManager {

  private EntityManager() {
  }
  //private static ThreadLocal<TransactionContext> contexts = new ThreadLocal<TransactionContext>();
  private static ConcurrentHashMap<Long, TransactionContext> contexts = new ConcurrentHashMap<Long, TransactionContext>();
  private static CopyOnWriteArrayList<ContextInitializer> contextInitializers = new CopyOnWriteArrayList<ContextInitializer>();

  public static void setContextInitializer(ContextInitializer ci) {
    contextInitializers.add(ci);
    RequestHandler.setStorageConnector(ci.getConnector());
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

  public static void commit(TransactionLocks tlm) throws StorageException {
    context().commit(tlm);
    removeContext();
  }

  public static void rollback(TransactionLocks tlm) throws StorageException {
    context().rollback();
    removeContext();
  }

  public static <T> void remove(T obj) throws PersistanceException {
    context().remove(obj);
  }

  public static void removeAll(Class type) throws PersistanceException {
    context().removeAll(type);
  }

  public static <T> Collection<T> findList(FinderType<T> finder, Object... params) throws PersistanceException {
    return context().findList(finder, params);
  }

  public static <T> T find(FinderType<T> finder, Object... params) throws PersistanceException {
    return context().find(finder, params);
  }

  public static <T> Collection<T> concurrentFindList(FinderType<T> finder, Long parentThreadId, Object... params) throws PersistanceException {
    return contexts.get(parentThreadId).findList(finder, params);
  }

  public static <T> T concurrentFind(FinderType<T> finder, Long parentThreadId, Object... params) throws PersistanceException {
    return contexts.get(parentThreadId).find(finder, params);
  }

  public static int count(CounterType counter, Object... params) throws PersistanceException {
    return context().count(counter, params);
  }

  public static <T> void update(T entity) throws PersistanceException {
    context().update(entity);
  }

  public static <T> void add(T entity) throws PersistanceException {
    context().add(entity);
  }
  
  public static <T> void snapshotMaintenance(TransactionContextMaintenanceCmds cmds, Object... params) throws PersistanceException{
    context().snapshotMaintenance(cmds, params);
  }

  public static void writeLock() throws StorageException {
    EntityContext.setLockMode(EntityContext.LockMode.WRITE_LOCK);
    contextInitializers.get(0).getConnector().writeLock();
  }

  public static void readLock() throws StorageException {
    EntityContext.setLockMode(EntityContext.LockMode.READ_LOCK);
    contextInitializers.get(0).getConnector().readLock();
  }

  public static void readCommited() throws StorageException {
    EntityContext.setLockMode(EntityContext.LockMode.READ_COMMITTED);
    contextInitializers.get(0).getConnector().readCommitted();
  }

  public static void setPartitionKey(Class name, Object key) throws StorageException {
    contextInitializers.get(0).getConnector().setPartitionKey(name, key);
  }

  /**
   * Clears transaction context's in-memory data
   */
  public static void clearContext() {
    context().clearContext();
  }
  
  public static Collection<EntityContextStat> collectSnapshotStat() throws PersistanceException{
    return context().collectSnapshotStat();
  }
  
  private static Long getThreadID(){
    return Thread.currentThread().getId();
  }
  
  private static TransactionContext addContext(){
    Long threadID = getThreadID();
    Map<Class, EntityContext> storageMap = new HashMap<Class, EntityContext>();
    for (ContextInitializer initializer : contextInitializers) {
      Map<Class, EntityContext> cs = initializer.createEntityContexts();
      for (Class clazz : cs.keySet()) {
        storageMap.put(clazz, cs.get(clazz));
      }
    }
    TransactionContext context = new TransactionContext(contextInitializers.get(0).getConnector(), storageMap);
    contexts.put(threadID, context);
    return context;
  }
  
  private static void removeContext(){
    Long threadID = getThreadID();
    contexts.remove(threadID);
  }
}
