package io.hops.metadata.hdfs.entity.yarn;

public class HopPendingEvent implements Comparable<HopPendingEvent> {

  private final String rmnodeId;
  private final byte type;
  private final byte status;
  //Used to order the events when retrieved by scheduler
  private final int id;

  public HopPendingEvent(String rmnodeId, byte type, byte status, int id) {
    this.rmnodeId = rmnodeId;
    this.type = type;
    this.status = status;
    this.id = id;
  }

  /**
   * Returns the globally unique id of the pending event.
   * <p>
   * @return
   */
  public int getId() {
    return id;
  }

  /**
   * Returns the RMNode id for which the event will be triggered.
   * <p>
   * @return
   */
  public String getRmnodeId() {
    return rmnodeId;
  }

  /**
   * Returns the event type, for example NODE_ADDED.
   * <p>
   * @return
   */
  public byte getType() {
    return type;
  }

  /**
   * Returns the node status, either NEW, PENDING, COMPLETED.
   * <p>
   * @return
   */
  public byte getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return "HopPendingEvent{" + "rmnodeId=" + rmnodeId + ", type=" + type
            + ", status=" + status + ", id=" + id + '}';
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 53 * hash + this.id;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final HopPendingEvent other = (HopPendingEvent) obj;
    if (this.id != other.id) {
      return false;
    }
    return true;
  }

  

  @Override
  public int compareTo(HopPendingEvent o) {
    if (o == null) {
      throw new NullPointerException("HopPendingEvent was null");
    }
    return this.id - o.getId();
  }

}
