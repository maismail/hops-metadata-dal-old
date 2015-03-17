package se.sics.hop.transaction.context;

import se.sics.hop.exception.LockUpgradeException;
import se.sics.hop.exception.StorageException;
import se.sics.hop.exception.TransactionContextException;
import se.sics.hop.metadata.hdfs.dal.VariableDataAccess;
import se.sics.hop.metadata.hdfs.entity.FinderType;
import se.sics.hop.metadata.hdfs.entity.hop.var.HopVariable;
import se.sics.hop.transaction.lock.HopsLock;
import se.sics.hop.transaction.lock.HopsVariablesLock;
import se.sics.hop.transaction.lock.TransactionLockTypes;
import se.sics.hop.transaction.lock.TransactionLocks;

import java.util.Collection;

public class VariableContext extends BaseEntityContext<HopVariable.Finder,
    HopVariable> {

  private final VariableDataAccess<HopVariable, HopVariable.Finder> dataAccess;

  public VariableContext(
      VariableDataAccess dataAccess) {
    this.dataAccess = dataAccess;
  }

  @Override
  public void update(HopVariable hopVariable)
      throws TransactionContextException {
    super.update(hopVariable);
    log(
        "updated-" + hopVariable.getType().toString(),
        "value", hopVariable.toString());
  }


  @Override
  public HopVariable find(FinderType<HopVariable> finder, Object... params)
      throws TransactionContextException, StorageException {
    HopVariable.Finder varType = (HopVariable.Finder) finder;
    HopVariable var = null;
    if (contains(varType)) {
      var = get(varType);
      hit(varType, var);
    } else {
      aboutToAccessStorage(finder, params);
      var = dataAccess.getVariable(varType);
      gotFromDB(varType, var);
      miss(varType, var);
    }
    return var;
  }

  @Override
  public void prepare(TransactionLocks lks)
      throws TransactionContextException, StorageException {
    Collection<HopVariable> added = getAdded();
    Collection<HopVariable> modified = getModified();
    if (lks.containsLock(HopsLock.Type.Variable)) {
      HopsVariablesLock hlk =
          (HopsVariablesLock) lks.getLock(HopsLock.Type.Variable);
      checkLockUpgrade(hlk, added);
      checkLockUpgrade(hlk, modified);
    }
    if (!getRemoved().isEmpty()) {
      throw new IllegalStateException("removed variables is " +
          "not empty even though VariableContext doesn't support remove");
    }
    dataAccess.prepare(added, modified, null);
  }

  private void checkLockUpgrade(HopsVariablesLock hlk,
      Collection<HopVariable> variables) throws
      LockUpgradeException {
    for (HopVariable var : variables) {
      if (!hlk.getVariableLockType(var.getType())
          .equals(TransactionLockTypes.LockType
              .WRITE)) {
        throw new LockUpgradeException(var.getType().toString());
      }
    }
  }

  @Override
  HopVariable.Finder getKey(HopVariable hopVariable) {
    return hopVariable.getType();
  }

}
