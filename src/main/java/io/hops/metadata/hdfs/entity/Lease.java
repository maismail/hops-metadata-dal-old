package io.hops.metadata.hdfs.entity;

public final class Lease implements Comparable<Lease>{

  private String holder;
  private long lastUpdate;
  private int holderId;

  public Lease() {
  }

  public Lease(String holder, int holderId, long lastUpdate) {
    this.holder = holder;
    this.holderId = holderId;
    this.lastUpdate = lastUpdate;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public long getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public int getHolderId() {
    return holderId;
  }

  public void setHolderId(int holderId) {
    this.holderId = holderId;
  }

  @Override
  public int compareTo(Lease o) {
    Lease l1 = this;
    Lease l2 = o;
    long lu1 = l1.lastUpdate;
    long lu2 = l2.lastUpdate;
    if (lu1 < lu2) {
      return -1;
    } else if (lu1 > lu2) {
      return 1;
    } else {
      return l1.holder.compareTo(l2.holder);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Lease)) {
      return false;
    }
    Lease obj = (Lease) o;
    if (lastUpdate == obj.lastUpdate
            && holder.equals(obj.holder)) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return holder.hashCode();
  }
}
