

package io.hops.metadata.yarn.tabledef.rmstatestore;

public interface ApplicationAttemptStateTableDef {
   public static final String TABLE_NAME = "applicationattemptstate";
  public static final String APPLICATIONID = "applicationid";
  public static final String APPLICATIONATTEMPTID = "applicationattemptid";
  public static final String APPLICATIONATTEMPTSTATE = "applicationattemptstate";
  public static final String HOST = "applicationattempthost";
  public static final String RPCPORT
          = "applicationattemptrpcport";
  public static final String TOKENS
          = "applicationattempttokens";
  public static final String TRAKINGURL
          = "applicationattempttrakingurl";
}
