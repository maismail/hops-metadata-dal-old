package io.hops.metadata.yarn.tabledef;

public interface FiCaSchedulerAppNewlyAllocatedContainersTableDef {
  public static final String TABLE_NAME =
      "ha_schedulerapp_newlyallocatedcontainers";
  public static final String SCHEDULERAPP_ID = "applicationattemptid";
  public static final String RMCONTAINER_ID = "rmcontainer_id";
}
