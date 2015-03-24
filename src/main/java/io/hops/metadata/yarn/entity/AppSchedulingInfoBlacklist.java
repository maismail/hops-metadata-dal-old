package io.hops.metadata.yarn.entity;

public class AppSchedulingInfoBlacklist {
  private String appschedulinginfo_id;
  private String blacklisted;

  public AppSchedulingInfoBlacklist(String appschedulinginfo_id,
      String blacklisted) {
    this.appschedulinginfo_id = appschedulinginfo_id;
    this.blacklisted = blacklisted;
  }

  public String getAppschedulinginfo_id() {
    return appschedulinginfo_id;
  }

  public String getBlacklisted() {
    return blacklisted;
  }
}
