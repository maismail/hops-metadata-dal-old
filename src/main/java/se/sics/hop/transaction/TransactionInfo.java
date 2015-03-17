package se.sics.hop.transaction;

import java.io.IOException;
import se.sics.hop.transaction.handler.RequestHandler.OperationType;

public interface TransactionInfo {

  public String getContextName(OperationType opType);

  public void performPostTransactionAction() throws IOException;
}
