package se.sics.hop.transaction;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
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
  private static ContextInitializer contextInitializer;

  public static void setContextInitializer(ContextInitializer ci) {
    contextInitializer = ci;
    RequestHandler.setStorageConnector(contextInitializer.getConnector());
  }
  
  private static TransactionContext context() {
    Long threadID;
    Thread currentThread = Thread.currentThread();
    if(currentThread instanceof ParallelReadThread){
      threadID = ((ParallelReadThread)currentThread).getParentId();
    }
    else{
      threadID = Thread.currentThread().getId();
    }
    
    TransactionContext context = contexts.get(threadID);
    if (context == null) {
      //System.out.println("EntityManager creating new context ");
      Map<Class, EntityContext> storageMap = contextInitializer.createEntityContexts();
      context = new TransactionContext(contextInitializer.getConnector(), storageMap);
      contexts.put(threadID,context);
    }
    return context;
  }

  public static void begin() throws StorageException {
    context().begin();
  }

  public static void preventStorageCall() {
    context().preventStorageCall();
  }

  public static void commit(TransactionLocks tlm) throws StorageException {
    context().commit(tlm);
  }

  public static void rollback() throws StorageException {
    context().rollback();
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

  public static void writeLock() {
    EntityContext.setLockMode(EntityContext.LockMode.WRITE_LOCK);
    contextInitializer.getConnector().writeLock();
  }

  public static void readLock() {
    EntityContext.setLockMode(EntityContext.LockMode.READ_LOCK);
    contextInitializer.getConnector().readLock();
  }

  public static void readCommited() {
    EntityContext.setLockMode(EntityContext.LockMode.READ_COMMITTED);
    contextInitializer.getConnector().readCommitted();
  }

  public static void setPartitionKey(Class name, Object key) {
    contextInitializer.getConnector().setPartitionKey(name, key);
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
}
