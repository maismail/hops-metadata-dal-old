package se.sics.hop.metadata.yarn.dal.util;

import se.sics.hop.transaction.handler.RequestHandler.OperationType;

public enum YARNOperationType implements OperationType {
    //RMNode

    GET_RMNODE,
    GET_LASTGIVENID,
    // Transaction in unit tests.
    TEST,
    GET_VARIABLE,
}
