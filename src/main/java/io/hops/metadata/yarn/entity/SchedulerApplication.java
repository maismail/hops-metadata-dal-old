package io.hops.metadata.yarn.entity;

public class SchedulerApplication {
  private final String appid;
  private final String user;
  private final String queuename;

  public SchedulerApplication(String appid, String user, String queuename) {
    this.appid = appid;
    this.user = user;
    this.queuename = queuename;
  }

  public String getAppid() {
    return appid;
  }

  public String getUser() {
    return user;
  }

  public String getQueuename() {
    return queuename;
  }
}
