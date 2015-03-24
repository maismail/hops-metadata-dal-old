package io.hops.transaction;

import io.hops.transaction.handler.RequestHandler.OperationType;

import java.io.IOException;

public interface TransactionInfo {

  public String getContextName(OperationType opType);

  public void performPostTransactionAction() throws IOException;
}
