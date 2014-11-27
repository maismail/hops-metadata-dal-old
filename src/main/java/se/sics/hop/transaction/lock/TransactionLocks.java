package se.sics.hop.transaction.lock;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface TransactionLocks extends OldTransactionLocks{

  TransactionLocks addLock(HopsLock lock);

  HopsLock getLock(HopsLock.Type lock);
}
