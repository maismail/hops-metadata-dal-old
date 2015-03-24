package io.hops.metadata.yarn.entity;

public class ResourceRequest {
  private final String id;
  private final int priority;
  private final String name;
  private final byte[] resourcerequeststate;

  public ResourceRequest(String id, int priority, String name,
      byte[] resourcerequeststate) {
    this.id = id;
    this.priority = priority;
    this.name = name;
    this.resourcerequeststate = resourcerequeststate;
  }

  public String getId() {
    return id;
  }

  public int getPriority() {
    return priority;
  }

  public String getName() {
    return name;
  }

  public byte[] getResourcerequeststate() {
    return resourcerequeststate;
  }
}
