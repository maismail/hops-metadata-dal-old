/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.transaction.lock;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface TransactionLocks extends OldTransactionLocks{

  void addLock(HopsLock lock);

  HopsLock getLock(HopsLock.Type lock);
}
