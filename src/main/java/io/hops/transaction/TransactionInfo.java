package io.hops.transaction;

import java.io.IOException;
import io.hops.transaction.handler.RequestHandler.OperationType;

public interface TransactionInfo {

  public String getContextName(OperationType opType);

  public void performPostTransactionAction() throws IOException;
}
