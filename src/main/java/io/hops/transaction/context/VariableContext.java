package io.hops.transaction.context;

import io.hops.exception.LockUpgradeException;
import io.hops.exception.StorageException;
import io.hops.metadata.common.FinderType;
import io.hops.metadata.common.entity.Variable;
import io.hops.transaction.lock.Lock;
import io.hops.transaction.lock.TransactionLocks;
import io.hops.exception.TransactionContextException;
import io.hops.metadata.hdfs.dal.VariableDataAccess;
import io.hops.transaction.lock.VariablesLock;
import io.hops.transaction.lock.TransactionLockTypes;

import java.util.Collection;

public class VariableContext extends BaseEntityContext<Variable.Finder,
    Variable> {

  private final VariableDataAccess<Variable, Variable.Finder> dataAccess;

  public VariableContext(
      VariableDataAccess dataAccess) {
    this.dataAccess = dataAccess;
  }

  @Override
  public void update(Variable hopVariable)
      throws TransactionContextException {
    super.update(hopVariable);
    log(
        "updated-" + hopVariable.getType().toString(),
        "value", hopVariable.toString());
  }


  @Override
  public Variable find(FinderType<Variable> finder, Object... params)
      throws TransactionContextException, StorageException {
    Variable.Finder varType = (Variable.Finder) finder;
    Variable var = null;
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
    Collection<Variable> added = getAdded();
    Collection<Variable> modified = getModified();
    if (lks.containsLock(Lock.Type.Variable)) {
      VariablesLock hlk =
          (VariablesLock) lks.getLock(Lock.Type.Variable);
      checkLockUpgrade(hlk, added);
      checkLockUpgrade(hlk, modified);
    }
    if (!getRemoved().isEmpty()) {
      throw new IllegalStateException("removed variables is " +
          "not empty even though VariableContext doesn't support remove");
    }
    dataAccess.prepare(added, modified, null);
  }

  private void checkLockUpgrade(VariablesLock hlk,
      Collection<Variable> variables) throws
      LockUpgradeException {
    for (Variable var : variables) {
      if (!hlk.getVariableLockType(var.getType())
          .equals(TransactionLockTypes.LockType
              .WRITE)) {
        throw new LockUpgradeException(var.getType().toString());
      }
    }
  }

  @Override
  Variable.Finder getKey(Variable hopVariable) {
    return hopVariable.getType();
  }

}
