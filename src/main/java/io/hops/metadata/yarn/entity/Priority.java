package io.hops.metadata.yarn.entity;

/**
 * Pojo representing Priority class.
 */
public class Priority {

  private int id;
  private int priority;

  public Priority(int id, int priority) {
    this.id = id;
    this.priority = priority;
  }

  public int getId() {
    return id;
  }

  public int getPriority() {
    return priority;
  }
}
